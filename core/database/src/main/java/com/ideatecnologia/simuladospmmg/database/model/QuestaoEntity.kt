package com.ideatecnologia.simuladospmmg.database.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "questao",
    foreignKeys = [ForeignKey(
        entity = MateriaEntity::class,
        parentColumns = ["id"],
        childColumns = ["materiaId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index(value = ["materiaId"])]
)
data class QuestaoEntity(
    @PrimaryKey val id: Int,
    val materiaId: Int,
    val dificuldade: Int,
    val origem: String,
    val enunciado: String
)