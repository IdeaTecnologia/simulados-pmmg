package com.ideatecnologia.simuladospmmg.data.model

data class AlternativaResponse(
    val codAlternativa: Int,
    val questoesCodQuestao: Int,
    val enunciado: String,
    val certoErrado: Char,
    val resposta: String
)