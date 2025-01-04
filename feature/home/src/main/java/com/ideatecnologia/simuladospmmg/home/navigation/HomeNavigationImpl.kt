package com.ideatecnologia.simuladospmmg.home.navigation

import androidx.navigation.NavGraphBuilder
import com.ideatecnologia.simuladospmmg.home.presentation.view.HomeRoute
import com.ideatecnologia.simuladospmmg.navigation.HomeNavigation
import com.ideatecnologia.simuladospmmg.navigation.HomeRoute
import com.ideatecnologia.simuladospmmg.navigation.extension.animatedComposable

internal class HomeNavigationImpl : HomeNavigation {

    override fun register(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.animatedComposable<HomeRoute> {
            HomeRoute()
        }
    }
}
