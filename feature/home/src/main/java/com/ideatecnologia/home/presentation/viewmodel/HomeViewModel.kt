package com.ideatecnologia.home.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ideatecnologia.home.presentation.state.HomeState

class HomeViewModel : ViewModel() {
    private val _state = mutableStateOf(HomeState.Loading)

    init {
        // fetch data
    }
}