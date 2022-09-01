package com.rikai.exercise.view.screens.profile


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rikai.exercise.repository.UserRepo
import com.rikai.exercise.view.NavigationKeys
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserProfileViewModel
@Inject constructor(
    private val stateHandle: SavedStateHandle,
    private val userRepo: UserRepo,
) : ViewModel() {

    var state by mutableStateOf(
        UserProfileContract.State(
            null
        )
    )

    init {
        viewModelScope.launch {
            //get userName from action navigation when click user item in list users
            val userName = stateHandle.get<String>(NavigationKeys.Arg.USER_NAME)
                ?: throw IllegalStateException("No userName was passed to destination.")
            //get user details
            val userDetail = userRepo.getUserProfile(userName)
            //update user details
            state = state.copy(userProfile = userDetail)
        }
    }

}