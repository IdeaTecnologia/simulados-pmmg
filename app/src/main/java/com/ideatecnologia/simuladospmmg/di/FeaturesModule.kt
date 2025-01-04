package com.ideatecnologia.simuladospmmg.di

import org.koin.core.module.Module

/*
object FeaturesModule : MultiFeatureModule() {
    override fun featureModules(): List<FeatureModule> = listOf(
        MainModule
    )
}*/

object FeaturesModule : FeatureModule {
    override fun modules(): List<Module> = listOf(
        MainModule
    ).flatMap { it.modules() }
}
