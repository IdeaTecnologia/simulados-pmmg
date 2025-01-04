package com.ideatecnologia.simuladospmmg.data.mapper

import com.ideatecnologia.simuladospmmg.data.model.MateriaResponse
import com.ideatecnologia.simuladospmmg.database.model.MateriaEntity
import com.ideatecnologia.simuladospmmg.domain.Materia

fun MateriaResponse.toDomain(): Materia = Materia(
    id = this.id ?: 0,
    nome = this.nome ?: ""
)

fun Materia.toEntity(): MateriaEntity = MateriaEntity(
    id = this.id,
    nome = this.nome
)

fun MateriaEntity.toDomain(): Materia = Materia(
    id = this.id,
    nome = this.nome
)