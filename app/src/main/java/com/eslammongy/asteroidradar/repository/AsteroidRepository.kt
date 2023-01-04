package com.eslammongy.asteroidradar.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.eslammongy.asteroidradar.api.*
import com.eslammongy.asteroidradar.database.AsteroidsDatabase
import com.eslammongy.asteroidradar.database.asDomainModel
import com.eslammongy.asteroidradar.domain.Asteroid
import com.eslammongy.asteroidradar.util.parseAsteroidsJsonResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.lang.Exception

class AsteroidRepository(private val database: AsteroidsDatabase) {

    val asteroids: LiveData<List<Asteroid>> = Transformations.map(database.asteroidDao.getAsteroid()) {
        it.asDomainModel()
    }

    fun getWeekAsteroids(startDate: String, endDate: String) = database.asteroidDao.getWeekAsteroids(startDate, endDate)

    fun getTodayAsteroids(todayDate: String) = database.asteroidDao.getTodayAsteroids(todayDate)

    fun deletePreviousDayAsteroid(date: String) = database.asteroidDao.deletePreviousDayAsteroids(date)

    suspend fun refreshAsteroid(startDate: String, endDate: String, apiKey: String) {
        withContext(Dispatchers.IO) {
            try {
                val resultList = AsteroidApi.retrofitService.getAsteroidProperties(startDate, endDate, apiKey)
                val asteroidList = parseAsteroidsJsonResult(JSONObject(resultList))
                database.asteroidDao.insertAll(*asteroidList.asDatabaseModel())
            } catch (e: Exception) {
                Log.i("Connection Error", e.message!!)

            }
        }
    }

    suspend fun getPictureOfTheDay(apiKey: String) = PictureOfDayApi.retrofitService.getImageOfTheDay(apiKey)
}