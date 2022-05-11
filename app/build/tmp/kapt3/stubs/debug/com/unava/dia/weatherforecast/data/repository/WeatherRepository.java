package com.unava.dia.weatherforecast.data.repository;

import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/unava/dia/weatherforecast/data/repository/WeatherRepository;", "Lcom/unava/dia/weatherforecast/data/repository/IWeatherRepository;", "currentWeatherDao", "Lcom/unava/dia/weatherforecast/data/dao/CurrentWeatherResponseDao;", "futureWeatherDao", "Lcom/unava/dia/weatherforecast/data/dao/FutureWeatherResponseDao;", "(Lcom/unava/dia/weatherforecast/data/dao/CurrentWeatherResponseDao;Lcom/unava/dia/weatherforecast/data/dao/FutureWeatherResponseDao;)V", "getCurrentWeather", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFutureWeather", "Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "insertCurrentWeather", "currentWeather", "(Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFutureWeather", "futureWeather", "(Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepository implements com.unava.dia.weatherforecast.data.repository.IWeatherRepository {
    private final com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao currentWeatherDao = null;
    private final com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao futureWeatherDao = null;
    
    @javax.inject.Inject()
    public WeatherRepository(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao currentWeatherDao, @org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao futureWeatherDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentWeather(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse currentWeather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFutureWeather(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertFutureWeather(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse futureWeather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
}