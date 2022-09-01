package com.rikai.exercise.view.screens.profile


import com.rikai.exercise.model.UserProfile


class UserProfileContract {
    data class State(
        val userProfile: UserProfile?,
    )
}