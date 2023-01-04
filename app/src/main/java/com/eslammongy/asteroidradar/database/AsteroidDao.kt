package com.eslammongy.asteroidradar.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface AsteroidDao {

    @Query("SELECT * FROM asteroids_table ORDER BY closeApproachDate ASC")
    fun getAsteroid(): LiveData<List<DatabaseAsteroid>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg asteroid: DatabaseAsteroid)

    @Query("SELECT * FROM asteroids_table WHERE closeApproachDate  BETWEEN :startDate AND :endDate ORDER BY closeApproachDate ASC")
    fun getWeekAsteroids(startDate: String, endDate: String): LiveData<List<DatabaseAsteroid>>

    @Query("SELECT * FROM asteroids_table WHERE closeApproachDate == :todayDate ORDER BY closeApproachDate ASC ")
    fun getTodayAsteroids(todayDate: String): LiveData<List<DatabaseAsteroid>>

    @Query("DELETE FROM asteroids_table WHERE closeApproachDate == :date")
    fun deletePreviousDayAsteroids(date: String)

}