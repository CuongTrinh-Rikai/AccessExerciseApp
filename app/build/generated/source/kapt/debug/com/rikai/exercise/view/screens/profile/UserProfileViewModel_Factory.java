// Generated by Dagger (https://dagger.dev).
package com.rikai.exercise.view.screens.profile;

import androidx.lifecycle.SavedStateHandle;
import com.rikai.exercise.repository.UserRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserProfileViewModel_Factory implements Factory<UserProfileViewModel> {
  private final Provider<SavedStateHandle> stateHandleProvider;

  private final Provider<UserRepo> userRepoProvider;

  public UserProfileViewModel_Factory(Provider<SavedStateHandle> stateHandleProvider,
      Provider<UserRepo> userRepoProvider) {
    this.stateHandleProvider = stateHandleProvider;
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public UserProfileViewModel get() {
    return newInstance(stateHandleProvider.get(), userRepoProvider.get());
  }

  public static UserProfileViewModel_Factory create(Provider<SavedStateHandle> stateHandleProvider,
      Provider<UserRepo> userRepoProvider) {
    return new UserProfileViewModel_Factory(stateHandleProvider, userRepoProvider);
  }

  public static UserProfileViewModel newInstance(SavedStateHandle stateHandle, UserRepo userRepo) {
    return new UserProfileViewModel(stateHandle, userRepo);
  }
}
