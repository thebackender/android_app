package com.unava.dia.weatherforecast.di;

import com.unava.dia.weatherforecast.data.api.ApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiFactory implements Factory<ApiInterface> {
  @Override
  public ApiInterface get() {
    return provideApi();
  }

  public static AppModule_ProvideApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiInterface provideApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApiFactory INSTANCE = new AppModule_ProvideApiFactory();
  }
}
