package com.unava.dia.weatherforecast.ui.fragments.future;

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
public final class FragmentFutureViewModel_Factory implements Factory<FragmentFutureViewModel> {
  private final Provider<ApiInterface> apiProvider;

  private final Provider<WeatherRepository> repositoryProvider;

  public FragmentFutureViewModel_Factory(Provider<ApiInterface> apiProvider,
      Provider<WeatherRepository> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FragmentFutureViewModel get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static FragmentFutureViewModel_Factory create(Provider<ApiInterface> apiProvider,
      Provider<WeatherRepository> repositoryProvider) {
    return new FragmentFutureViewModel_Factory(apiProvider, repositoryProvider);
  }

  public static FragmentFutureViewModel newInstance(ApiInterface api,
      WeatherRepository repository) {
    return new FragmentFutureViewModel(api, repository);
  }
}
