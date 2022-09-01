package com.rikai.exercise.view.screens.users

import com.rikai.exercise.model.User


class UsersContract {
    data class State(
        val users: List<User> = listOf(),
        val isLoading: Boolean = false
    )
}