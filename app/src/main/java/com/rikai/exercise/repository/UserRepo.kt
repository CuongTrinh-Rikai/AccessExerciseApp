package com.rikai.exercise.repository

import com.rikai.exercise.apiservice.UserApi
import com.rikai.exercise.model.User
import com.rikai.exercise.model.UserProfile
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepo @Inject constructor(
    private val userApi: UserApi
) {
    //get users list
    suspend fun getUsers(pageSize: Int): List<User> {
        return userApi.getUsers(pageSize = pageSize)
    }

    //get user profile
    suspend fun getUserProfile(userName : String): UserProfile {
        return userApi.getUserProfile(username = userName)
    }
}