package com.ideatecnologia.simuladospmmg.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materia")
data class MateriaEntity(
    @PrimaryKey val id: Int,
    val nome: String
)