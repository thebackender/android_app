package com.unava.dia.weatherforecast.ui.fragments.current;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.unava.dia.weatherforecast.data.api.ApiInterface;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.repository.WeatherRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0013J\u0010\u0010&\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\rH\u0002J\u000e\u0010\u001a\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/current/CurrentViewModel;", "Landroidx/lifecycle/ViewModel;", "api", "Lcom/unava/dia/weatherforecast/data/api/ApiInterface;", "repository", "Lcom/unava/dia/weatherforecast/data/repository/WeatherRepository;", "(Lcom/unava/dia/weatherforecast/data/api/ApiInterface;Lcom/unava/dia/weatherforecast/data/repository/WeatherRepository;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentWeather", "Landroidx/lifecycle/MutableLiveData;", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "getCurrentWeather", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentWeather", "(Landroidx/lifecycle/MutableLiveData;)V", "error", "", "getError", "setError", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "idMutable", "getIdMutable", "setIdMutable", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "", "country", "saveToDb", "currentId", "app_debug"})
public final class CurrentViewModel extends androidx.lifecycle.ViewModel {
    private final com.unava.dia.weatherforecast.data.api.ApiInterface api = null;
    private final com.unava.dia.weatherforecast.data.repository.WeatherRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> error;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse> currentWeather;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> idMutable;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @javax.inject.Inject()
    public CurrentViewModel(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.api.ApiInterface api, @org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.repository.WeatherRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse> getCurrentWeather() {
        return null;
    }
    
    public final void setCurrentWeather(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getIdMutable() {
        return null;
    }
    
    public final void setIdMutable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final void setId(long currentId) {
    }
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public final void getCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String country) {
    }
    
    private final void saveToDb(com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse currentWeather) {
    }
}