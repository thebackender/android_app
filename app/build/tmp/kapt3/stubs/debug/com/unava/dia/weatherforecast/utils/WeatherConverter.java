package com.unava.dia.weatherforecast.utils;

import androidx.room.TypeConverter;
import com.squareup.moshi.Moshi;
import com.unava.dia.weatherforecast.data.model.curernt.Current;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.curernt.Location;
import com.unava.dia.weatherforecast.data.model.future.Forecast;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/unava/dia/weatherforecast/utils/WeatherConverter;", "", "()V", "fromCurrent", "", "value", "Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "fromCurrentWeatherResponse", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "fromForecast", "Lcom/unava/dia/weatherforecast/data/model/future/Forecast;", "fromLocation", "Lcom/unava/dia/weatherforecast/data/model/curernt/Location;", "toCurrent", "toCurrentWeatherResponse", "toForecast", "toLocation", "app_debug"})
public final class WeatherConverter {
    
    public WeatherConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCurrentWeatherResponse(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse toCurrentWeatherResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCurrent(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.Current value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.unava.dia.weatherforecast.data.model.curernt.Current toCurrent(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromLocation(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.curernt.Location value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.unava.dia.weatherforecast.data.model.curernt.Location toLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromForecast(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.model.future.Forecast value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.unava.dia.weatherforecast.data.model.future.Forecast toForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}