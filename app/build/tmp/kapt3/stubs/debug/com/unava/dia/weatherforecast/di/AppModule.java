package com.unava.dia.weatherforecast.di;

import android.content.Context;
import androidx.room.Room;
import com.unava.dia.weatherforecast.data.api.ApiInterface;
import com.unava.dia.weatherforecast.data.api.AppDatabase;
import com.unava.dia.weatherforecast.data.api.RetrofitFactory;
import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
import com.unava.dia.weatherforecast.data.repository.IWeatherRepository;
import com.unava.dia.weatherforecast.data.repository.WeatherRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/unava/dia/weatherforecast/di/AppModule;", "", "()V", "provideApi", "Lcom/unava/dia/weatherforecast/data/api/ApiInterface;", "provideAppDatabase", "Lcom/unava/dia/weatherforecast/data/api/AppDatabase;", "app", "Landroid/content/Context;", "provideCurrentWeatherDao", "Lcom/unava/dia/weatherforecast/data/dao/CurrentWeatherResponseDao;", "db", "provideFutureWeatherDao", "Lcom/unava/dia/weatherforecast/data/dao/FutureWeatherResponseDao;", "provideRepository", "Lcom/unava/dia/weatherforecast/data/repository/IWeatherRepository;", "currentWeatherDao", "futureWeatherDao", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.unava.dia.weatherforecast.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.unava.dia.weatherforecast.data.api.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao provideCurrentWeatherDao(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.api.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao provideFutureWeatherDao(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.api.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.unava.dia.weatherforecast.data.repository.IWeatherRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao currentWeatherDao, @org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao futureWeatherDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.unava.dia.weatherforecast.data.api.ApiInterface provideApi() {
        return null;
    }
}