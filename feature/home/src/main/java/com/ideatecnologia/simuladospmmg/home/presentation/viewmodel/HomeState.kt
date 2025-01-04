package com.ideatecnologia.simuladospmmg.home.presentation.viewmodel

sealed class HomeState {
    data object Loading : HomeState()
    data object Success : HomeState()
    data object Error : HomeState()
}