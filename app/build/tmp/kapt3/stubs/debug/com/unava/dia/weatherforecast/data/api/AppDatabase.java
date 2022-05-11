package com.unava.dia.weatherforecast.data.api;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;
import com.unava.dia.weatherforecast.utils.WeatherConverter;

@androidx.room.TypeConverters(value = {com.unava.dia.weatherforecast.utils.WeatherConverter.class})
@androidx.room.Database(entities = {com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse.class, com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/unava/dia/weatherforecast/data/api/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "currentWeatherDao", "Lcom/unava/dia/weatherforecast/data/dao/CurrentWeatherResponseDao;", "futureWeatherDao", "Lcom/unava/dia/weatherforecast/data/dao/FutureWeatherResponseDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao currentWeatherDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao futureWeatherDao();
}