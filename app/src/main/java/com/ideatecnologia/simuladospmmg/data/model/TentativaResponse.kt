package com.ideatecnologia.simuladospmmg.data.model

import java.util.Date

data class TentativaResponse(
    val codTentativa: Int,
    val resultado: Char,
    val data: Date,
    val questaoCodQuestao: Int
)