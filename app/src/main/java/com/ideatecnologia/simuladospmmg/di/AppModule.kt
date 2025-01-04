package com.ideatecnologia.simuladospmmg.di

import com.google.firebase.firestore.FirebaseFirestore
import org.koin.dsl.module

val appModule = module {
    single { FirebaseFirestore.getInstance() }
}