package com.unava.dia.weatherforecast.data.repository;

import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/unava/dia/weatherforecast/data/repository/IWeatherRepository;", "", "getCurrentWeather", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFutureWeather", "Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "insertCurrentWeather", "currentWeather", "(Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFutureWeather", "futureWeather", "(Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IWeatherRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentWeather(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse currentWeather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFutureWeather(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertFutureWeather(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse futureWeather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
}