package com.ideatecnologia.simuladospmmg.domain.usecase

import com.ideatecnologia.simuladospmmg.domain.Materia
import com.ideatecnologia.simuladospmmg.domain.repository.SimuladosRepository
import kotlinx.coroutines.flow.Flow

class GetMateriasUseCase(private val repository: SimuladosRepository) {
    operator fun invoke(): Flow<List<Materia>> {
        return repository.getMaterias()
    }
}