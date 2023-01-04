package com.eslammongy.asteroidradar.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\'J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\'J!\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0011\"\u00020\tH\'\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/eslammongy/asteroidradar/database/AsteroidDao;", "", "deletePreviousDayAsteroids", "", "date", "", "getAsteroid", "Landroidx/lifecycle/LiveData;", "", "Lcom/eslammongy/asteroidradar/database/DatabaseAsteroid;", "getTodayAsteroids", "todayDate", "getWeekAsteroids", "startDate", "endDate", "insertAll", "asteroid", "", "([Lcom/eslammongy/asteroidradar/database/DatabaseAsteroid;)V", "app_debug"})
public abstract interface AsteroidDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM asteroids_table ORDER BY closeApproachDate ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.database.DatabaseAsteroid>> getAsteroid();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.eslammongy.asteroidradar.database.DatabaseAsteroid... asteroid);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM asteroids_table WHERE closeApproachDate  BETWEEN :startDate AND :endDate ORDER BY closeApproachDate ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.database.DatabaseAsteroid>> getWeekAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM asteroids_table WHERE closeApproachDate == :todayDate ORDER BY closeApproachDate ASC ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.database.DatabaseAsteroid>> getTodayAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String todayDate);
    
    @androidx.room.Query(value = "DELETE FROM asteroids_table WHERE closeApproachDate == :date")
    public abstract void deletePreviousDayAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String date);
}