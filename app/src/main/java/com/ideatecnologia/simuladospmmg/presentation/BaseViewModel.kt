package com.ideatecnologia.simuladospmmg.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<Action, State, Effect>(initialState: State) : ViewModel() {

    private val _state = MutableStateFlow(initialState)
    val state = _state.asStateFlow()

    private val _effect = MutableSharedFlow<Effect>()
    val effect = _effect.asSharedFlow()

    abstract fun sendAction(action: Action)

    protected fun updateState(uiState: State) {
        _state.value = uiState
    }

    protected suspend fun sendEffect(uiEffect: Effect) {
        _effect.emit(uiEffect)
    }
}