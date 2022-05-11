package com.unava.dia.weatherforecast.di;

import android.content.Context;
import com.unava.dia.weatherforecast.data.api.AppDatabase;
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
public final class AppModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideAppDatabaseFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(appProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideAppDatabaseFactory(appProvider);
  }

  public static AppDatabase provideAppDatabase(Context app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppDatabase(app));
  }
}
