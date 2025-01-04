package com.ideatecnologia.simuladospmmg.data.datasource.database

import com.ideatecnologia.simuladospmmg.database.model.MateriaEntity
import kotlinx.coroutines.flow.Flow

interface SimuladosLocalDataSource {
    suspend fun insertMateria(materia: MateriaEntity)
    suspend fun insertMaterias(materias: List<MateriaEntity>)
    fun getMaterias(): Flow<List<MateriaEntity>>
}