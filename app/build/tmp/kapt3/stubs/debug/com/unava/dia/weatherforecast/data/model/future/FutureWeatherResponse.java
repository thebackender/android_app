package com.unava.dia.weatherforecast.data.model.future;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.unava.dia.weatherforecast.data.model.curernt.Current;
import com.unava.dia.weatherforecast.data.model.curernt.Location;

@androidx.room.Entity(tableName = "futureWeather")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "", "id", "", "location", "Lcom/unava/dia/weatherforecast/data/model/curernt/Location;", "current", "Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "forecast", "Lcom/unava/dia/weatherforecast/data/model/future/Forecast;", "(Ljava/lang/Integer;Lcom/unava/dia/weatherforecast/data/model/curernt/Location;Lcom/unava/dia/weatherforecast/data/model/curernt/Current;Lcom/unava/dia/weatherforecast/data/model/future/Forecast;)V", "getCurrent", "()Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "setCurrent", "(Lcom/unava/dia/weatherforecast/data/model/curernt/Current;)V", "getForecast", "()Lcom/unava/dia/weatherforecast/data/model/future/Forecast;", "setForecast", "(Lcom/unava/dia/weatherforecast/data/model/future/Forecast;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLocation", "()Lcom/unava/dia/weatherforecast/data/model/curernt/Location;", "setLocation", "(Lcom/unava/dia/weatherforecast/data/model/curernt/Location;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lcom/unava/dia/weatherforecast/data/model/curernt/Location;Lcom/unava/dia/weatherforecast/data/model/curernt/Current;Lcom/unava/dia/weatherforecast/data/model/future/Forecast;)Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class FutureWeatherResponse {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private com.unava.dia.weatherforecast.data.model.curernt.Location location;
    @org.jetbrains.annotations.Nullable()
    private com.unava.dia.weatherforecast.data.model.curernt.Current current;
    @org.jetbrains.annotations.Nullable()
    private com.unava.dia.weatherforecast.data.model.future.Forecast forecast;
    
    @org.jetbrains.annotations.NotNull()
    public final com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Location location, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Current current, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.future.Forecast forecast) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FutureWeatherResponse() {
        super();
    }
    
    public FutureWeatherResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Location location, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Current current, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.future.Forecast forecast) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.curernt.Location component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.curernt.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Location p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.curernt.Current component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.curernt.Current getCurrent() {
        return null;
    }
    
    public final void setCurrent(@org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Current p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.future.Forecast component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.future.Forecast getForecast() {
        return null;
    }
    
    public final void setForecast(@org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.future.Forecast p0) {
    }
}