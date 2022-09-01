package com.rikai.exercise.view.screens.users;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/rikai/exercise/view/screens/users/UsersViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepo", "Lcom/rikai/exercise/repository/UserRepo;", "(Lcom/rikai/exercise/repository/UserRepo;)V", "<set-?>", "Lcom/rikai/exercise/view/screens/users/UsersContract$State;", "state", "getState", "()Lcom/rikai/exercise/view/screens/users/UsersContract$State;", "setState", "(Lcom/rikai/exercise/view/screens/users/UsersContract$State;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "app_debug"})
public final class UsersViewModel extends androidx.lifecycle.ViewModel {
    private final com.rikai.exercise.repository.UserRepo userRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    com.rikai.exercise.repository.UserRepo userRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rikai.exercise.view.screens.users.UsersContract.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.rikai.exercise.view.screens.users.UsersContract.State p0) {
    }
}