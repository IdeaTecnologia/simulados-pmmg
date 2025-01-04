package com.ideatecnologia.simuladospmmg.presentation.viewmodel

import com.ideatecnologia.simuladospmmg.domain.Materia

sealed class MainViewState {
    data object Loading : MainViewState()
    data class Success(val materias: List<Materia>) : MainViewState()
    data object Error : MainViewState()
}