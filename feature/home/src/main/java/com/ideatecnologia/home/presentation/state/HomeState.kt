package com.ideatecnologia.home.presentation.state

sealed class HomeState {
    data object Loading : HomeState()
    data object Success : HomeState()
    data object Error : HomeState()
}