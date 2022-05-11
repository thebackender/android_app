package com.unava.dia.weatherforecast.ui.fragments.future;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.unava.dia.weatherforecast.data.api.ApiInterface;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;
import com.unava.dia.weatherforecast.data.repository.WeatherRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020#2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0011H\u0002J\u000e\u0010\u0019\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0014R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/future/FragmentFutureViewModel;", "Landroidx/lifecycle/ViewModel;", "api", "Lcom/unava/dia/weatherforecast/data/api/ApiInterface;", "repository", "Lcom/unava/dia/weatherforecast/data/repository/WeatherRepository;", "(Lcom/unava/dia/weatherforecast/data/api/ApiInterface;Lcom/unava/dia/weatherforecast/data/repository/WeatherRepository;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "error", "Landroidx/lifecycle/MutableLiveData;", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "futureWeather", "Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "getFutureWeather", "setFutureWeather", "(Landroidx/lifecycle/MutableLiveData;)V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "idMutable", "getIdMutable", "setIdMutable", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "", "country", "days", "", "saveToDb", "weather", "currentId", "app_debug"})
public final class FragmentFutureViewModel extends androidx.lifecycle.ViewModel {
    private final com.unava.dia.weatherforecast.data.api.ApiInterface api = null;
    private final com.unava.dia.weatherforecast.data.repository.WeatherRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse> futureWeather;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> idMutable;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    
    @javax.inject.Inject()
    public FragmentFutureViewModel(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.api.ApiInterface api, @org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.repository.WeatherRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse> getFutureWeather() {
        return null;
    }
    
    public final void setFutureWeather(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getIdMutable() {
        return null;
    }
    
    public final void setIdMutable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
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
    
    public final void getFutureWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String country, int days) {
    }
    
    private final void saveToDb(com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse weather) {
    }
}