package com.ideatecnologia.simuladospmmg.home.di

import com.ideatecnologia.simuladospmmg.home.navigation.HomeNavigationImpl
import com.ideatecnologia.simuladospmmg.home.presentation.viewmodel.HomeViewModel
import com.ideatecnologia.simuladospmmg.navigation.HomeNavigation
import com.ideatecnologia.simuladospmmg.navigation.extension.provideFeatureRoute
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val homeModule = module {
    viewModelOf(::HomeViewModel)
    provideFeatureRoute<HomeNavigation> { HomeNavigationImpl() }
}