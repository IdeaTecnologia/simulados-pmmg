package com.ideatecnologia.simuladospmmg.database.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "tentativa",
    foreignKeys = [ForeignKey(
        entity = QuestaoEntity::class,
        parentColumns = ["id"],
        childColumns = ["questaoId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index(value = ["questaoId"])]
)
data class TentativaEntity(
    @PrimaryKey val id: Int,
    val questaoId: Int,
    val resultado: Boolean,
    val data: Long,
)