package com.ideatecnologia.simuladospmmg.domain.usecase

import com.ideatecnologia.simuladospmmg.domain.repository.SimuladosRepository

class SyncMateriasUseCase(
    private val repository: SimuladosRepository
) {
    suspend operator fun invoke() {
        repository.syncMaterias()
    }
}