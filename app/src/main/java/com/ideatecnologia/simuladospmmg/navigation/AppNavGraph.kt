package com.ideatecnologia.simuladospmmg.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ideatecnologia.simuladospmmg.navigation.di.FEATURE_ROUTES_QUALIFIER
import org.koin.core.qualifier.named
import org.koin.mp.KoinPlatform.getKoin

@Composable
fun AppNavGraph(
    navController: NavHostController,
) {

    NavHost(
        navController = navController,
        startDestination = HomeRoute,
    ) {
        val featureRoutes: List<FeatureRoute> = getKoin().get(named(FEATURE_ROUTES_QUALIFIER))
        featureRoutes.forEach { featureRoute ->
            featureRoute.register(navGraphBuilder = this)
        }
    }
}