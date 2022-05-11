package com.unava.dia.weatherforecast.data.model.future;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010L\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u00f2\u0001\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010[\u001a\u00020\\H\u00d6\u0001J\t\u0010]\u001a\u00020^H\u00d6\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b?\u0010\u0019\"\u0004\b@\u0010\u001bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010\u001b\u00a8\u0006_"}, d2 = {"Lcom/unava/dia/weatherforecast/data/model/future/Day;", "", "maxtemp_c", "", "maxtemp_f", "mintemp_c", "mintemp_f", "avgtemp_c", "avgtemp_f", "maxwind_mph", "maxwind_kph", "totalprecip_mm", "totalprecip_in", "avgvis_km", "avgvis_miles", "avghumidity", "daily_will_it_rain", "daily_chance_of_rain", "daily_will_it_snow", "daily_chance_of_snow", "condition", "Lcom/unava/dia/weatherforecast/data/model/future/Condition;", "uv", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/unava/dia/weatherforecast/data/model/future/Condition;Ljava/lang/Double;)V", "getAvghumidity", "()Ljava/lang/Double;", "setAvghumidity", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAvgtemp_c", "setAvgtemp_c", "getAvgtemp_f", "setAvgtemp_f", "getAvgvis_km", "setAvgvis_km", "getAvgvis_miles", "setAvgvis_miles", "getCondition", "()Lcom/unava/dia/weatherforecast/data/model/future/Condition;", "setCondition", "(Lcom/unava/dia/weatherforecast/data/model/future/Condition;)V", "getDaily_chance_of_rain", "setDaily_chance_of_rain", "getDaily_chance_of_snow", "setDaily_chance_of_snow", "getDaily_will_it_rain", "setDaily_will_it_rain", "getDaily_will_it_snow", "setDaily_will_it_snow", "getMaxtemp_c", "setMaxtemp_c", "getMaxtemp_f", "setMaxtemp_f", "getMaxwind_kph", "setMaxwind_kph", "getMaxwind_mph", "setMaxwind_mph", "getMintemp_c", "setMintemp_c", "getMintemp_f", "setMintemp_f", "getTotalprecip_in", "setTotalprecip_in", "getTotalprecip_mm", "setTotalprecip_mm", "getUv", "setUv", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/unava/dia/weatherforecast/data/model/future/Condition;Ljava/lang/Double;)Lcom/unava/dia/weatherforecast/data/model/future/Day;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Day {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double maxtemp_c;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double maxtemp_f;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mintemp_c;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mintemp_f;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double avgtemp_c;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double avgtemp_f;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double maxwind_mph;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double maxwind_kph;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double totalprecip_mm;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double totalprecip_in;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double avgvis_km;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double avgvis_miles;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double avghumidity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double daily_will_it_rain;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double daily_chance_of_rain;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double daily_will_it_snow;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double daily_chance_of_snow;
    @org.jetbrains.annotations.Nullable()
    private com.unava.dia.weatherforecast.data.model.future.Condition condition;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double uv;
    
    @org.jetbrains.annotations.NotNull()
    public final com.unava.dia.weatherforecast.data.model.future.Day copy(@org.jetbrains.annotations.Nullable()
    java.lang.Double maxtemp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double maxtemp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double mintemp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double mintemp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgtemp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgtemp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double maxwind_mph, @org.jetbrains.annotations.Nullable()
    java.lang.Double maxwind_kph, @org.jetbrains.annotations.Nullable()
    java.lang.Double totalprecip_mm, @org.jetbrains.annotations.Nullable()
    java.lang.Double totalprecip_in, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgvis_km, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgvis_miles, @org.jetbrains.annotations.Nullable()
    java.lang.Double avghumidity, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_will_it_rain, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_chance_of_rain, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_will_it_snow, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_chance_of_snow, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.future.Condition condition, @org.jetbrains.annotations.Nullable()
    java.lang.Double uv) {
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
    
    public Day() {
        super();
    }
    
    public Day(@org.jetbrains.annotations.Nullable()
    java.lang.Double maxtemp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double maxtemp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double mintemp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double mintemp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgtemp_c, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgtemp_f, @org.jetbrains.annotations.Nullable()
    java.lang.Double maxwind_mph, @org.jetbrains.annotations.Nullable()
    java.lang.Double maxwind_kph, @org.jetbrains.annotations.Nullable()
    java.lang.Double totalprecip_mm, @org.jetbrains.annotations.Nullable()
    java.lang.Double totalprecip_in, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgvis_km, @org.jetbrains.annotations.Nullable()
    java.lang.Double avgvis_miles, @org.jetbrains.annotations.Nullable()
    java.lang.Double avghumidity, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_will_it_rain, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_chance_of_rain, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_will_it_snow, @org.jetbrains.annotations.Nullable()
    java.lang.Double daily_chance_of_snow, @org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.future.Condition condition, @org.jetbrains.annotations.Nullable()
    java.lang.Double uv) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMaxtemp_c() {
        return null;
    }
    
    public final void setMaxtemp_c(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMaxtemp_f() {
        return null;
    }
    
    public final void setMaxtemp_f(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMintemp_c() {
        return null;
    }
    
    public final void setMintemp_c(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMintemp_f() {
        return null;
    }
    
    public final void setMintemp_f(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAvgtemp_c() {
        return null;
    }
    
    public final void setAvgtemp_c(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAvgtemp_f() {
        return null;
    }
    
    public final void setAvgtemp_f(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMaxwind_mph() {
        return null;
    }
    
    public final void setMaxwind_mph(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMaxwind_kph() {
        return null;
    }
    
    public final void setMaxwind_kph(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTotalprecip_mm() {
        return null;
    }
    
    public final void setTotalprecip_mm(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTotalprecip_in() {
        return null;
    }
    
    public final void setTotalprecip_in(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAvgvis_km() {
        return null;
    }
    
    public final void setAvgvis_km(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAvgvis_miles() {
        return null;
    }
    
    public final void setAvgvis_miles(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAvghumidity() {
        return null;
    }
    
    public final void setAvghumidity(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDaily_will_it_rain() {
        return null;
    }
    
    public final void setDaily_will_it_rain(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDaily_chance_of_rain() {
        return null;
    }
    
    public final void setDaily_chance_of_rain(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDaily_will_it_snow() {
        return null;
    }
    
    public final void setDaily_will_it_snow(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDaily_chance_of_snow() {
        return null;
    }
    
    public final void setDaily_chance_of_snow(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.future.Condition component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unava.dia.weatherforecast.data.model.future.Condition getCondition() {
        return null;
    }
    
    public final void setCondition(@org.jetbrains.annotations.Nullable()
    com.unava.dia.weatherforecast.data.model.future.Condition p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getUv() {
        return null;
    }
    
    public final void setUv(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
}