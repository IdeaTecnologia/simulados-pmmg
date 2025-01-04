package com.ideatecnologia.simuladospmmg.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ideatecnologia.simuladospmmg.database.model.MateriaEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MateriaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(materiaEntity: MateriaEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(materias: List<MateriaEntity>)

    @Query("SELECT * FROM Materia")
    fun getAllMaterias(): Flow<List<MateriaEntity>>
}