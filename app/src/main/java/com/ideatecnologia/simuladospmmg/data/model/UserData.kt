package com.ideatecnologia.simuladospmmg.data.model

import com.ideatecnologia.simuladospmmg.presentation.model.DarkThemeConfig
import com.ideatecnologia.simuladospmmg.presentation.model.ThemeBrand

data class UserData(
    val bookmarkedNewsResources: Set<String>,
    val viewedNewsResources: Set<String>,
    val followedTopics: Set<String>,
    val themeBrand: ThemeBrand,
    val darkThemeConfig: DarkThemeConfig,
    val useDynamicColor: Boolean,
    val shouldHideOnboarding: Boolean,
)
