package com.ideatecnologia.simuladospmmg.di

import com.ideatecnologia.simuladospmmg.database.di.DatabaseModule
import com.ideatecnologia.simuladospmmg.home.di.homeModule
import com.ideatecnologia.simuladospmmg.navigation.di.navigationModule
import org.koin.core.module.Module

/*
object AppInject {
    fun modules(modules: List<Module> = emptyList()): List<Module> =
        arrayListOf<Module>().apply {
            add(appModule)
            addAll(modules)
            addAll(FeaturesModule.modules())
        }
}*/
object KoinModuleInitializer {
    fun modules(modules: List<Module> = emptyList()): List<Module> =
        arrayListOf<Module>().apply {
            addAll(modules)
            add(appModule)
            add(DatabaseModule.module)
            add(homeModule)
            addAll(FeaturesModule.modules())
            add(navigationModule)
        }
}
