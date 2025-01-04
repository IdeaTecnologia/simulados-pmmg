package com.ideatecnologia.simuladospmmg.navigation

import kotlinx.serialization.Serializable

interface HomeNavigation : FeatureRoute, NavigateRoute<HomeRoute>

@Serializable
object HomeRoute
