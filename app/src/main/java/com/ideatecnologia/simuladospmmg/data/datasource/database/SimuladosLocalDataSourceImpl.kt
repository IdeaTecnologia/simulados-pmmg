package com.ideatecnologia.simuladospmmg.data.datasource.database

import com.ideatecnologia.simuladospmmg.database.dao.MateriaDao
import com.ideatecnologia.simuladospmmg.database.model.MateriaEntity
import kotlinx.coroutines.flow.Flow

class SimuladosLocalDataSourceImpl(private val materiaDao: MateriaDao) : SimuladosLocalDataSource {
    override suspend fun insertMateria(materia: MateriaEntity) {
        materiaDao.insert(materia)
    }

    override suspend fun insertMaterias(materias: List<MateriaEntity>) {
        materiaDao.insertAll(materias)
    }

    override fun getMaterias(): Flow<List<MateriaEntity>> {
        return materiaDao.getAllMaterias()
    }
}