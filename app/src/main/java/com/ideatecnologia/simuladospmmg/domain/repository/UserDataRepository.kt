package com.ideatecnologia.simuladospmmg.domain.repository

import com.ideatecnologia.simuladospmmg.data.model.UserData
import kotlinx.coroutines.flow.Flow

interface UserDataRepository {
    val userData: Flow<UserData>
}