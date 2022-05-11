package com.unava.dia.weatherforecast.di;

import com.unava.dia.weatherforecast.data.api.AppDatabase;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
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
public final class AppModule_ProvideFutureWeatherDaoFactory implements Factory<FutureWeatherResponseDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideFutureWeatherDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FutureWeatherResponseDao get() {
    return provideFutureWeatherDao(dbProvider.get());
  }

  public static AppModule_ProvideFutureWeatherDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideFutureWeatherDaoFactory(dbProvider);
  }

  public static FutureWeatherResponseDao provideFutureWeatherDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFutureWeatherDao(db));
  }
}
