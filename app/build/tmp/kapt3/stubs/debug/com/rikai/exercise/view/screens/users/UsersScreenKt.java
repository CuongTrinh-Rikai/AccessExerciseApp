package com.rikai.exercise.view.screens.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a$\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a3\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a;\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\u0013"}, d2 = {"LoadingBar", "", "UserItem", "user", "Lcom/rikai/exercise/model/User;", "selectedItem", "Lkotlin/Function1;", "", "UserListScreen", "state", "Lcom/rikai/exercise/view/screens/users/UsersContract$State;", "onNavigationRequested", "Lkotlin/ParameterName;", "name", "userName", "UsersList", "users", "", "onItemClicked", "app_debug"})
public final class UsersScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void UserListScreen(@org.jetbrains.annotations.NotNull()
    com.rikai.exercise.view.screens.users.UsersContract.State state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigationRequested) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LoadingBar() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void UsersList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rikai.exercise.model.User> users, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void UserItem(@org.jetbrains.annotations.NotNull()
    com.rikai.exercise.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> selectedItem) {
    }
}