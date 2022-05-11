package com.unava.dia.weatherforecast.data.dao;

import androidx.room.*;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u001b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/unava/dia/weatherforecast/data/dao/CurrentWeatherResponseDao;", "", "delete", "", "weather", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "(Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeather", "id", "", "getCurrentWeatherList", "", "insert", "update", "app_debug"})
public abstract interface CurrentWeatherResponseDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from currentWeather")
    public abstract java.util.List<com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse> getCurrentWeatherList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM currentWeather WHERE id =:id")
    public abstract com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse getCurrentWeather(long id);
}