package com.ideatecnologia.simuladospmmg.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ideatecnologia.simuladospmmg.database.model.TentativaEntity

@Dao
interface TentativaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(tentativaEntity: TentativaEntity)

    @Query("SELECT * FROM Tentativa")
    suspend fun getAllTentativas(): List<TentativaEntity>
}