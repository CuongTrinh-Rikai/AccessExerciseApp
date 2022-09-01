package com.rikai.exercise.apiservice

import com.rikai.exercise.model.User
import com.rikai.exercise.model.UserProfile
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface UserApi {

    //get list of users
    @GET(ApiConfig.USERS_SERVICE)
    suspend fun getUsers(@Query("per_page") pageSize : Int) : List<User>

    //get user details
    @GET(ApiConfig.USERS_SERVICE +"/{username}")
    suspend fun getUserProfile(@Path("username") username: String) : UserProfile
}