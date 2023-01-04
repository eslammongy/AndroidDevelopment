package com.eslammongy.asteroidradar.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/eslammongy/asteroidradar/api/PictureOfDayApiService;", "", "getImageOfTheDay", "Lcom/eslammongy/asteroidradar/domain/PictureOfDay;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PictureOfDayApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planetary/apod")
    public abstract java.lang.Object getImageOfTheDay(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eslammongy.asteroidradar.domain.PictureOfDay> continuation);
}