package com.ideatecnologia.simuladospmmg.domain.repository

import com.ideatecnologia.simuladospmmg.data.model.AlternativaResponse
import com.ideatecnologia.simuladospmmg.data.model.QuestaoResponse
import com.ideatecnologia.simuladospmmg.data.model.TentativaResponse
import com.ideatecnologia.simuladospmmg.domain.Materia
import kotlinx.coroutines.flow.Flow

interface SimuladosRepository {
    suspend fun syncMaterias()
    fun getMaterias(): Flow<List<Materia>>
    suspend fun getQuestoes(): List<QuestaoResponse>
    suspend fun getAlternativas(questaoId: Int): List<AlternativaResponse>
    suspend fun getTentativas(): List<TentativaResponse>
}
