package com.ideatecnologia.simuladospmmg.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ideatecnologia.simuladospmmg.database.model.QuestaoEntity

@Dao
interface QuestaoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(questaoEntity: QuestaoEntity)

    @Query("SELECT * FROM Questao")
    suspend fun getAllQuestoes(): List<QuestaoEntity>
}