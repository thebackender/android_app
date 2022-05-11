package com.unava.dia.weatherforecast.data.dao;

import androidx.room.*;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\'J\u001b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/unava/dia/weatherforecast/data/dao/FutureWeatherResponseDao;", "", "delete", "", "weather", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "(Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFutureWeather", "Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "id", "", "getFutureWeatherList", "", "insert", "(Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface FutureWeatherResponseDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from futureWeather")
    public abstract java.util.List<com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse> getFutureWeatherList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM futureWeather WHERE id =:id")
    public abstract com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse getFutureWeather(long id);
}