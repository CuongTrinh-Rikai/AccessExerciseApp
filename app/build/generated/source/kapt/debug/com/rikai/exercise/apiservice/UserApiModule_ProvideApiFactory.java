// Generated by Dagger (https://dagger.dev).
package com.rikai.exercise.apiservice;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserApiModule_ProvideApiFactory implements Factory<UserApi> {
  private final Provider<Retrofit.Builder> builderProvider;

  public UserApiModule_ProvideApiFactory(Provider<Retrofit.Builder> builderProvider) {
    this.builderProvider = builderProvider;
  }

  @Override
  public UserApi get() {
    return provideApi(builderProvider.get());
  }

  public static UserApiModule_ProvideApiFactory create(Provider<Retrofit.Builder> builderProvider) {
    return new UserApiModule_ProvideApiFactory(builderProvider);
  }

  public static UserApi provideApi(Retrofit.Builder builder) {
    return Preconditions.checkNotNullFromProvides(UserApiModule.INSTANCE.provideApi(builder));
  }
}
