package com.ideatecnologia.simuladospmmg.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.ideatecnologia.simuladospmmg.domain.usecase.GetMateriasUseCase
import com.ideatecnologia.simuladospmmg.domain.usecase.SyncMateriasUseCase
import com.ideatecnologia.simuladospmmg.presentation.BaseViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class MainViewModel(
    private val syncMateriasUseCase: SyncMateriasUseCase,
    private val getMateriasUseCase: GetMateriasUseCase
) :
    BaseViewModel<MainViewAction, MainViewState, Unit>(MainViewState.Loading) {

    init {
        sendAction(MainViewAction.LoadData)
    }


    override fun sendAction(action: MainViewAction) {
        when (action) {
            is MainViewAction.LoadData -> loadData()
        }
    }

    private fun loadData() {
        viewModelScope.launch {
            val syncResult = runCatching { syncMateriasUseCase() }

            syncResult.onSuccess {
                getMateriasUseCase()
                    .catch { exception ->
                        Log.d("XXX", "getMateriasUseCase Error: $exception")
                        updateState(MainViewState.Error)
                    }
                    .collect { materias ->
                        Log.d("XXX", "collect getMateriasUseCase: $materias")
                        updateState(MainViewState.Success(materias))
                    }
            }.onFailure { exception ->
                Log.d("XXX", "syncResult Error: $exception")
                updateState(MainViewState.Error)
            }
        }
    }
}
