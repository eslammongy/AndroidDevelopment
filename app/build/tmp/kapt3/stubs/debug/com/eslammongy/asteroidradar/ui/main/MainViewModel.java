package com.eslammongy.asteroidradar.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/eslammongy/asteroidradar/ui/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_pictureOfTheDay", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eslammongy/asteroidradar/domain/PictureOfDay;", "_status", "Lcom/eslammongy/asteroidradar/ui/main/MainViewModel$NasaApiStatus;", "asteroidRepository", "Lcom/eslammongy/asteroidradar/repository/AsteroidRepository;", "asteroids", "Landroidx/lifecycle/LiveData;", "", "Lcom/eslammongy/asteroidradar/domain/Asteroid;", "getAsteroids", "()Landroidx/lifecycle/LiveData;", "setAsteroids", "(Landroidx/lifecycle/LiveData;)V", "database", "Lcom/eslammongy/asteroidradar/database/AsteroidsDatabase;", "endDate", "", "pictureOfTheDay", "getPictureOfTheDay", "startDate", "status", "getStatus", "weekEnd", "", "getRefreshAsteroid", "getTodayAsteroids", "getWeekAsteroid", "NasaApiStatus", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.eslammongy.asteroidradar.database.AsteroidsDatabase database = null;
    private final com.eslammongy.asteroidradar.repository.AsteroidRepository asteroidRepository = null;
    private final java.lang.String startDate = null;
    private final java.lang.String endDate = null;
    private final java.lang.String weekEnd = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> asteroids;
    private final androidx.lifecycle.MutableLiveData<com.eslammongy.asteroidradar.ui.main.MainViewModel.NasaApiStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<com.eslammongy.asteroidradar.domain.PictureOfDay> _pictureOfTheDay = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> getAsteroids() {
        return null;
    }
    
    public final void setAsteroids(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.ui.main.MainViewModel.NasaApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.PictureOfDay> getPictureOfTheDay() {
        return null;
    }
    
    private final void getRefreshAsteroid() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> getWeekAsteroid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eslammongy.asteroidradar.domain.Asteroid>> getTodayAsteroids() {
        return null;
    }
    
    private final void getPictureOfTheDay() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/eslammongy/asteroidradar/ui/main/MainViewModel$NasaApiStatus;", "", "(Ljava/lang/String;I)V", "LOADING", "DONE", "ERROR", "app_debug"})
    public static enum NasaApiStatus {
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ DONE /* = new DONE() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        NasaApiStatus() {
        }
    }
}