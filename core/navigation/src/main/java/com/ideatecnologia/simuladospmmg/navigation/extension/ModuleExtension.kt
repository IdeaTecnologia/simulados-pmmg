package com.ideatecnologia.simuladospmmg.navigation.extension

import com.ideatecnologia.simuladospmmg.navigation.FeatureRoute
import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

inline fun <reified T : FeatureRoute> Module.provideFeatureRoute(
    crossinline instance: Scope.() -> T
) {
    factory<T> { instance() }
    factory<FeatureRoute>(named(T::class.java.name)) { get<T>() }
}
