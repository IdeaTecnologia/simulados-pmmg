package com.ideatecnologia.simuladospmmg.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ideatecnologia.simuladospmmg.database.model.AlternativaEntity

@Dao
interface AlternativaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(alternativaEntity: AlternativaEntity)

    @Query("SELECT * FROM Alternativa")
    suspend fun getAllAlternativas(): List<AlternativaEntity>
}
