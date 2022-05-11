package com.unava.dia.weatherforecast.data.repository;

import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepository_Factory implements Factory<WeatherRepository> {
  private final Provider<CurrentWeatherResponseDao> currentWeatherDaoProvider;

  private final Provider<FutureWeatherResponseDao> futureWeatherDaoProvider;

  public WeatherRepository_Factory(Provider<CurrentWeatherResponseDao> currentWeatherDaoProvider,
      Provider<FutureWeatherResponseDao> futureWeatherDaoProvider) {
    this.currentWeatherDaoProvider = currentWeatherDaoProvider;
    this.futureWeatherDaoProvider = futureWeatherDaoProvider;
  }

  @Override
  public WeatherRepository get() {
    return newInstance(currentWeatherDaoProvider.get(), futureWeatherDaoProvider.get());
  }

  public static WeatherRepository_Factory create(
      Provider<CurrentWeatherResponseDao> currentWeatherDaoProvider,
      Provider<FutureWeatherResponseDao> futureWeatherDaoProvider) {
    return new WeatherRepository_Factory(currentWeatherDaoProvider, futureWeatherDaoProvider);
  }

  public static WeatherRepository newInstance(CurrentWeatherResponseDao currentWeatherDao,
      FutureWeatherResponseDao futureWeatherDao) {
    return new WeatherRepository(currentWeatherDao, futureWeatherDao);
  }
}
