package com.rikai.exercise.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/rikai/exercise/view/NavigationKeys;", "", "()V", "Arg", "Route", "app_debug"})
public final class NavigationKeys {
    @org.jetbrains.annotations.NotNull()
    public static final com.rikai.exercise.view.NavigationKeys INSTANCE = null;
    
    private NavigationKeys() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rikai/exercise/view/NavigationKeys$Arg;", "", "()V", "USER_NAME", "", "app_debug"})
    public static final class Arg {
        @org.jetbrains.annotations.NotNull()
        public static final com.rikai.exercise.view.NavigationKeys.Arg INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_NAME = "userName";
        
        private Arg() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/rikai/exercise/view/NavigationKeys$Route;", "", "()V", "USER_DETAILS", "", "USER_LIST", "app_debug"})
    public static final class Route {
        @org.jetbrains.annotations.NotNull()
        public static final com.rikai.exercise.view.NavigationKeys.Route INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_LIST = "user_list";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_DETAILS = "user_list/{userName}";
        
        private Route() {
            super();
        }
    }
}