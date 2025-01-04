package com.ideatecnologia.simuladospmmg.navigation.di

import com.ideatecnologia.simuladospmmg.navigation.FeatureRoute
import org.koin.core.qualifier.named
import org.koin.dsl.module

const val FEATURE_ROUTES_QUALIFIER = "feature_routes"

val navigationModule = module {
    single(named(FEATURE_ROUTES_QUALIFIER)) {
        getAll<FeatureRoute>()
    }
}