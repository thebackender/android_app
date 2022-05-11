package com.unava.dia.weatherforecast.di;

import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
import com.unava.dia.weatherforecast.data.repository.IWeatherRepository;
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
public final class AppModule_ProvideRepositoryFactory implements Factory<IWeatherRepository> {
  private final Provider<CurrentWeatherResponseDao> currentWeatherDaoProvider;

  private final Provider<FutureWeatherResponseDao> futureWeatherDaoProvider;

  public AppModule_ProvideRepositoryFactory(
      Provider<CurrentWeatherResponseDao> currentWeatherDaoProvider,
      Provider<FutureWeatherResponseDao> futureWeatherDaoProvider) {
    this.currentWeatherDaoProvider = currentWeatherDaoProvider;
    this.futureWeatherDaoProvider = futureWeatherDaoProvider;
  }

  @Override
  public IWeatherRepository get() {
    return provideRepository(currentWeatherDaoProvider.get(), futureWeatherDaoProvider.get());
  }

  public static AppModule_ProvideRepositoryFactory create(
      Provider<CurrentWeatherResponseDao> currentWeatherDaoProvider,
      Provider<FutureWeatherResponseDao> futureWeatherDaoProvider) {
    return new AppModule_ProvideRepositoryFactory(currentWeatherDaoProvider, futureWeatherDaoProvider);
  }

  public static IWeatherRepository provideRepository(CurrentWeatherResponseDao currentWeatherDao,
      FutureWeatherResponseDao futureWeatherDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRepository(currentWeatherDao, futureWeatherDao));
  }
}
