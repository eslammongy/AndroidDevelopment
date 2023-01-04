package com.eslammongy.asteroidradar.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u000eJ\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eJ)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/eslammongy/asteroidradar/repository/AsteroidRepository;", "", "database", "Lcom/eslammongy/asteroidradar/database/AsteroidsDatabase;", "(Lcom/eslammongy/asteroidradar/database/AsteroidsDatabase;)V", "asteroids", "Landroidx/lifecycle/LiveData;", "", "Lcom/eslammongy/asteroidradar/domain/Asteroid;", "getAsteroids", "()Landroidx/lifecycle/LiveData;", "deletePreviousDayAsteroid", "", "date", "", "getPictureOfTheDay", "Lcom/eslammongy/asteroidradar/domain/PictureOfDay;", "apiKey", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodayAsteroids", "Lcom/eslammongy/asteroidradar/database/DatabaseAsteroid;", "todayDate", "getWeekAsteroids", "startDate", "endDate", "refreshAsteroid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AsteroidRepository {
    private final com.eslammongy.asteroidradar.database.AsteroidsDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> asteroids = null;
    
    public AsteroidRepository(@org.jetbrains.annotations.NotNull()
    com.eslammongy.asteroidradar.database.AsteroidsDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> getAsteroids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.database.DatabaseAsteroid>> getWeekAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.database.DatabaseAsteroid>> getTodayAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String todayDate) {
        return null;
    }
    
    public final void deletePreviousDayAsteroid(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshAsteroid(@org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPictureOfTheDay(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eslammongy.asteroidradar.domain.PictureOfDay> continuation) {
        return null;
    }
}