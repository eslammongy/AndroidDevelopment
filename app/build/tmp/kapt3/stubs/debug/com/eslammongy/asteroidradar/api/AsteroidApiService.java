package com.eslammongy.asteroidradar.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/eslammongy/asteroidradar/api/AsteroidApiService;", "", "getAsteroidProperties", "", "startDate", "endDate", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AsteroidApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "neo/rest/v1/feed")
    public abstract java.lang.Object getAsteroidProperties(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "start_date")
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "end_date")
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}