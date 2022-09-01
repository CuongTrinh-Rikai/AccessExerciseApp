package com.rikai.exercise.view.screens.profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/rikai/exercise/view/screens/profile/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "stateHandle", "Landroidx/lifecycle/SavedStateHandle;", "userRepo", "Lcom/rikai/exercise/repository/UserRepo;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/rikai/exercise/repository/UserRepo;)V", "<set-?>", "Lcom/rikai/exercise/view/screens/profile/UserProfileContract$State;", "state", "getState", "()Lcom/rikai/exercise/view/screens/profile/UserProfileContract$State;", "setState", "(Lcom/rikai/exercise/view/screens/profile/UserProfileContract$State;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "app_debug"})
public final class UserProfileViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.SavedStateHandle stateHandle = null;
    private final com.rikai.exercise.repository.UserRepo userRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public UserProfileViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle stateHandle, @org.jetbrains.annotations.NotNull()
    com.rikai.exercise.repository.UserRepo userRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rikai.exercise.view.screens.profile.UserProfileContract.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.rikai.exercise.view.screens.profile.UserProfileContract.State p0) {
    }
}