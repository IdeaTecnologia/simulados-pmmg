package com.ideatecnologia.simuladospmmg.data.datasource.firestore

import com.ideatecnologia.simuladospmmg.data.model.AlternativaResponse
import com.ideatecnologia.simuladospmmg.data.model.MateriaResponse
import com.ideatecnologia.simuladospmmg.data.model.QuestaoResponse
import com.ideatecnologia.simuladospmmg.data.model.TentativaResponse

interface SimuladosRemoteDataSource {
    suspend fun getMaterias(): List<MateriaResponse>
    suspend fun getQuestoes(): List<QuestaoResponse>
    suspend fun getAlternativas(questaoId: Int): List<AlternativaResponse>
    suspend fun getTentativas(): List<TentativaResponse>
}