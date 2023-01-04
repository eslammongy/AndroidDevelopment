package com.eslammongy.asteroidradar.ui.main

import android.app.Application
import androidx.lifecycle.*
import com.eslammongy.asteroidradar.util.getNextSevenDaysFormattedDates
import com.eslammongy.asteroidradar.database.AsteroidsDatabase
import com.eslammongy.asteroidradar.database.asDomainModel
import com.eslammongy.asteroidradar.domain.Asteroid
import com.eslammongy.asteroidradar.domain.PictureOfDay
import com.eslammongy.asteroidradar.repository.AsteroidRepository
import com.eslammongy.asteroidradar.util.Constants
import kotlinx.coroutines.launch
import kotlin.Exception

class MainViewModel(application: Application) : AndroidViewModel(application) {
    enum class NasaApiStatus { LOADING, DONE, ERROR }

    private val database = AsteroidsDatabase.getInstance(application)
    private val asteroidRepository = AsteroidRepository(database)

    private val startDate = getNextSevenDaysFormattedDates()[0]
    private val endDate = getNextSevenDaysFormattedDates()[5]
    private val weekEnd = getNextSevenDaysFormattedDates()[5]


    var asteroids: LiveData<List<Asteroid>> = asteroidRepository.asteroids

    private val _status = MutableLiveData<NasaApiStatus>()
    val status: LiveData<NasaApiStatus>
        get() = _status


    private val _pictureOfTheDay = MutableLiveData<PictureOfDay>()
    val pictureOfTheDay: LiveData<PictureOfDay>
        get() = _pictureOfTheDay


    init {
        getRefreshAsteroid()
    }

    private fun getRefreshAsteroid() {
        viewModelScope.launch {
            try {
                asteroidRepository.refreshAsteroid(startDate, endDate, Constants.API_KEY)
                getPictureOfTheDay()
            } catch (e: Exception) {

            }
        }
    }

    fun getWeekAsteroid(): LiveData<List<Asteroid>> {
        val weekAsteroid = Transformations.map(asteroidRepository.getWeekAsteroids(startDate, weekEnd)) {
            it.asDomainModel()
        }
        return weekAsteroid
    }

    fun getTodayAsteroids(): LiveData<List<Asteroid>> {
        val todayAsteroids = Transformations.map(asteroidRepository.getTodayAsteroids(startDate)) {
            it.asDomainModel()
        }
        return todayAsteroids
    }

    private fun getPictureOfTheDay() {
        viewModelScope.launch {
            try {
                _status.value = NasaApiStatus.LOADING
                val picture = asteroidRepository.getPictureOfTheDay(Constants.API_KEY)
                picture.let {
                    _pictureOfTheDay.value = picture
                    _status.value = NasaApiStatus.DONE
                }
            } catch (e: Exception) {
                _status.value = NasaApiStatus.ERROR
            }

        }
    }
}