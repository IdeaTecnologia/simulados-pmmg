package com.ideatecnologia.simuladospmmg.di

import org.koin.core.module.Module

open class BaseFeatureModule : FeatureModule {
    open fun dataModule(): Module? = null
    open fun domainModule(): Module? = null
    open fun presentationModule(): Module? = null

    override fun modules(): List<Module> {
        return listOfNotNull(dataModule(), domainModule(), presentationModule())
    }
}