package com.ideatecnologia.simuladospmmg.data.model

data class QuestaoResponse(
    val codQuestao: Int,
    val materiasCodMateria: Int,
    val dificuldade: Int,
    val origem: String,
    val enunciado: String
)