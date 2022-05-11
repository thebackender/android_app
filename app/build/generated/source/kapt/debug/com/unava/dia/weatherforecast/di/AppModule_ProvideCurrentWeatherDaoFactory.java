package com.unava.dia.weatherforecast.di;

import com.unava.dia.weatherforecast.data.api.AppDatabase;
import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideCurrentWeatherDaoFactory implements Factory<CurrentWeatherResponseDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideCurrentWeatherDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public CurrentWeatherResponseDao get() {
    return provideCurrentWeatherDao(dbProvider.get());
  }

  public static AppModule_ProvideCurrentWeatherDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideCurrentWeatherDaoFactory(dbProvider);
  }

  public static CurrentWeatherResponseDao provideCurrentWeatherDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCurrentWeatherDao(db));
  }
}
