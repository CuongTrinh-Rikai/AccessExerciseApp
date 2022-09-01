package com.rikai.exercise.apiservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/rikai/exercise/apiservice/UserApi;", "", "getUserProfile", "Lcom/rikai/exercise/model/UserProfile;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "", "Lcom/rikai/exercise/model/User;", "pageSize", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public abstract interface UserApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getUsers(@retrofit2.http.Query(value = "per_page")
    int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.rikai.exercise.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{username}")
    public abstract java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rikai.exercise.model.UserProfile> continuation);
}