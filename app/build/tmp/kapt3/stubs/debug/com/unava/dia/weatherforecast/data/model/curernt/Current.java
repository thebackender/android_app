package com.unava.dia.weatherforecast.data.model.curernt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010L\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u00a2\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020VH\u00d6\u0001J\t\u0010W\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\b\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010+R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b,\u0010\u001eR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b-\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b.\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b/\u0010\u001eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b0\u0010\u001eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b1\u0010\u001eR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b2\u0010\u001eR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b3\u0010\u001eR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b4\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b5\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b7\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b8\u0010\u001e\u00a8\u0006X"}, d2 = {"Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "", "last_updated_epoch", "", "last_updated", "", "temp_c", "temp_f", "is_day", "condition", "Lcom/unava/dia/weatherforecast/data/model/curernt/Condition;", "wind_mph", "wind_kph", "wind_degree", "wind_dir", "pressure_mb", "pressure_in", "precip_mm", "precip_in", "humidity", "cloud", "feelslike_c", "feelslike_f", "vis_km", "vis_miles", "uv", "gust_mph", "gust_kph", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/unava/dia/weatherforecast/data/model/curernt/Condition;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getCloud", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCondition", "()Lcom/unava/dia/weatherforecast/data/model/curernt/Condition;", "getFeelslike_c", "getFeelslike_f", "getGust_kph", "getGust_mph", "getHumidity", "getLast_updated", "()Ljava/lang/String;", "getLast_updated_epoch", "setLast_updated_epoch", "(Ljava/lang/Double;)V", "getPrecip_in", "getPrecip_mm", "getPressure_in", "getPressure_mb", "getTemp_c", "getTemp_f", "getUv", "getVis_km", "getVis_miles", "getWind_degree", "getWind_dir", "getWind_kph", "getWind_mph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/unava/dia/weatherforecast/data/model/curernt/Condition;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/unava/dia/weatherforecast/data/model/curernt/Current;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Current {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double last_updated_epoch;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last_updated = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double temp_c = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double temp_f = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double is_day = null;
    @org.jetbrains.annotations.Nullable()
    private final com.unava.dia.weatherforecast.data.model.curernt.Condition condition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double wind_mph = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double wind_kph = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double wind_degree = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String wind_dir = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double pressure_mb = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double pressure_in = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double precip_mm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double precip_in = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double humidity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double cloud = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double feelslike_c = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double feelslike_f = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double vis_km = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double vis_miles = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double uv = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double gust_mph = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double gust_kph = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.unava.dia.weatherforecast.data.model.curernt.Current copy(@org.jetbrains.annotations.Nullable()
    java.lang.Double last_updated_epoch, @org.jetbrains.annotations.Nullable()
    java.lang.String last_updated, @org.jetbrains.annotations.Nullable()
    java.lang.Double temp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double temp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double is_day, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Condition condition, @org.jetbrains.annotations.Nullable()
    java.lang.Double wind_mph, @org.jetbrains.annotations.Nullable()
    java.lang.Double wind_kph, @org.jetbrains.annotations.Nullable()
    java.lang.Double wind_degree, @org.jetbrains.annotations.Nullable()
    java.lang.String wind_dir, @org.jetbrains.annotations.Nullable()
    java.lang.Double pressure_mb, @org.jetbrains.annotations.Nullable()
    java.lang.Double pressure_in, @org.jetbrains.annotations.Nullable()
    java.lang.Double precip_mm, @org.jetbrains.annotations.Nullable()
    java.lang.Double precip_in, @org.jetbrains.annotations.Nullable()
    java.lang.Double humidity, @org.jetbrains.annotations.Nullable()
    java.lang.Double cloud, @org.jetbrains.annotations.Nullable()
    java.lang.Double feelslike_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double feelslike_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double vis_km, @org.jetbrains.annotations.Nullable()
    java.lang.Double vis_miles, @org.jetbrains.annotations.Nullable()
    java.lang.Double uv, @org.jetbrains.annotations.Nullable()
    java.lang.Double gust_mph, @org.jetbrains.annotations.Nullable()
    java.lang.Double gust_kph) {
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
    
    public Current() {
        super();
    }
    
    public Current(@org.jetbrains.annotations.Nullable()
    java.lang.Double last_updated_epoch, @org.jetbrains.annotations.Nullable()
    java.lang.String last_updated, @org.jetbrains.annotations.Nullable()
    java.lang.Double temp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double temp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double is_day, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.curernt.Condition condition, @org.jetbrains.annotations.Nullable()
    java.lang.Double wind_mph, @org.jetbrains.annotations.Nullable()
    java.lang.Double wind_kph, @org.jetbrains.annotations.Nullable()
    java.lang.Double wind_degree, @org.jetbrains.annotations.Nullable()
    java.lang.String wind_dir, @org.jetbrains.annotations.Nullable()
    java.lang.Double pressure_mb, @org.jetbrains.annotations.Nullable()
    java.lang.Double pressure_in, @org.jetbrains.annotations.Nullable()
    java.lang.Double precip_mm, @org.jetbrains.annotations.Nullable()
    java.lang.Double precip_in, @org.jetbrains.annotations.Nullable()
    java.lang.Double humidity, @org.jetbrains.annotations.Nullable()
    java.lang.Double cloud, @org.jetbrains.annotations.Nullable()
    java.lang.Double feelslike_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double feelslike_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double vis_km, @org.jetbrains.annotations.Nullable()
    java.lang.Double vis_miles, @org.jetbrains.annotations.Nullable()
    java.lang.Double uv, @org.jetbrains.annotations.Nullable()
    java.lang.Double gust_mph, @org.jetbrains.annotations.Nullable()
    java.lang.Double gust_kph) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLast_updated_epoch() {
        return null;
    }
    
    public final void setLast_updated_epoch(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_updated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemp_c() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemp_f() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double is_day() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.curernt.Condition component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.curernt.Condition getCondition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWind_mph() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWind_kph() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWind_degree() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWind_dir() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPressure_mb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPressure_in() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecip_mm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecip_in() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCloud() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getFeelslike_c() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getFeelslike_f() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVis_km() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVis_miles() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getUv() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getGust_mph() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getGust_kph() {
        return null;
    }
}