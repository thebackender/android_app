package com.unava.dia.weatherforecast.data.api;

import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/unava/dia/weatherforecast/data/api/ApiInterface;", "", "getCurrentWeatherAsync", "Lretrofit2/Response;", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFutureWeatherAsync", "Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "location", "days", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiInterface {
    
    /**
     * запрос для получения текущей погоды
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "current.json")
    public abstract java.lang.Object getCurrentWeatherAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse>> continuation);
    
    /**
     * запрос для получения прогноза погоды
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "forecast.json")
    public abstract java.lang.Object getFutureWeatherAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @retrofit2.http.Query(value = "days")
    int days, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse>> continuation);
}