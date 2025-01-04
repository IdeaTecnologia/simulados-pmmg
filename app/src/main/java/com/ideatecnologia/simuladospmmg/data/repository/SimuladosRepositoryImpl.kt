package com.ideatecnologia.simuladospmmg.data.repository

import com.ideatecnologia.simuladospmmg.data.datasource.database.SimuladosLocalDataSource
import com.ideatecnologia.simuladospmmg.data.datasource.firestore.SimuladosRemoteDataSource
import com.ideatecnologia.simuladospmmg.data.mapper.toDomain
import com.ideatecnologia.simuladospmmg.data.mapper.toEntity
import com.ideatecnologia.simuladospmmg.data.model.AlternativaResponse
import com.ideatecnologia.simuladospmmg.data.model.QuestaoResponse
import com.ideatecnologia.simuladospmmg.data.model.TentativaResponse
import com.ideatecnologia.simuladospmmg.domain.Materia
import com.ideatecnologia.simuladospmmg.domain.repository.SimuladosRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SimuladosRepositoryImpl(
    private val remoteDataSource: SimuladosRemoteDataSource,
    private val localDataSource: SimuladosLocalDataSource
) :
    SimuladosRepository {
    override suspend fun syncMaterias() {
        val materiasResponse = remoteDataSource.getMaterias()
        val materiasDomain = materiasResponse.map { it.toDomain() }
        val materiaEntities = materiasDomain.map { it.toEntity() }
        localDataSource.insertMaterias(materiaEntities)
    }

    override fun getMaterias(): Flow<List<Materia>> {
        return localDataSource.getMaterias()
            .map { entities -> entities.map { it.toDomain() } }
    }

    override suspend fun getQuestoes(): List<QuestaoResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getAlternativas(questaoId: Int): List<AlternativaResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getTentativas(): List<TentativaResponse> {
        TODO("Not yet implemented")
    }
}