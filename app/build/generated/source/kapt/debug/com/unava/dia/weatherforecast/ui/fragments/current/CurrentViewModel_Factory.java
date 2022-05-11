package com.unava.dia.weatherforecast.ui.fragments.current;

import com.unava.dia.weatherforecast.data.api.ApiInterface;
import com.unava.dia.weatherforecast.data.repository.WeatherRepository;
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
public final class CurrentViewModel_Factory implements Factory<CurrentViewModel> {
  private final Provider<ApiInterface> apiProvider;

  private final Provider<WeatherRepository> repositoryProvider;

  public CurrentViewModel_Factory(Provider<ApiInterface> apiProvider,
      Provider<WeatherRepository> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CurrentViewModel get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static CurrentViewModel_Factory create(Provider<ApiInterface> apiProvider,
      Provider<WeatherRepository> repositoryProvider) {
    return new CurrentViewModel_Factory(apiProvider, repositoryProvider);
  }

  public static CurrentViewModel newInstance(ApiInterface api, WeatherRepository repository) {
    return new CurrentViewModel(api, repository);
  }
}
