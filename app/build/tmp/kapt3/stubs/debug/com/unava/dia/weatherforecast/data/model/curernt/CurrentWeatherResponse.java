package com.unava.dia.weatherforecast.data.model.curernt;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "currentWeather")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "", "id", "", "location", "Lcom/unava/dia/weatherforecast/data/model/curernt/Location;", "current", "Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "(Ljava/lang/Integer;Lcom/unava/dia/weatherforecast/data/model/curernt/Location;Lcom/unava/dia/weatherforecast/data/model/curernt/Current;)V", "getCurrent", "()Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "setCurrent", "(Lcom/unava/dia/weatherforecast/data/model/curernt/Current;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLocation", "()Lcom/unava/dia/weatherforecast/data/model/curernt/Location;", "setLocation", "(Lcom/unava/dia/weatherforecast/data/model/curernt/Location;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/unava/dia/weatherforecast/data/model/curernt/Location;Lcom/unava/dia/weatherforecast/data/model/curernt/Current;)Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class CurrentWeatherResponse {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private com.unava.dia.weatherforecast.data.model.curernt.Location location;
    @org.jetbrains.annotations.Nullable()
    private com.unava.dia.weatherforecast.data.model.curernt.Current current;
    
    @org.jetbrains.annotations.NotNull()
    public final com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Location location, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Current current) {
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
    
    public CurrentWeatherResponse() {
        super();
    }
    
    public CurrentWeatherResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Location location, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Current current) {
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
}