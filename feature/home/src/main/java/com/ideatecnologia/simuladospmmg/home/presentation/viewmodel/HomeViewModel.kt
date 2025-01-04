package com.ideatecnologia.simuladospmmg.home.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _state = mutableStateOf(HomeState.Loading)

    init {
        // fetch data
    }
}