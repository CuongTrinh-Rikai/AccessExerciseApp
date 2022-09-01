package com.rikai.exercise.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/rikai/exercise/repository/UserRepo;", "", "userApi", "Lcom/rikai/exercise/apiservice/UserApi;", "(Lcom/rikai/exercise/apiservice/UserApi;)V", "getUserProfile", "Lcom/rikai/exercise/model/UserProfile;", "userName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "", "Lcom/rikai/exercise/model/User;", "pageSize", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class UserRepo {
    private final com.rikai.exercise.apiservice.UserApi userApi = null;
    
    @javax.inject.Inject()
    public UserRepo(@org.jetbrains.annotations.NotNull()
    com.rikai.exercise.apiservice.UserApi userApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsers(int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.rikai.exercise.model.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rikai.exercise.model.UserProfile> continuation) {
        return null;
    }
}