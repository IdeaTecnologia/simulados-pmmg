plugins {
    alias(libs.plugins.simuladospmmg.android.library)
    alias(libs.plugins.simuladospmmg.android.library.compose)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.ideatecnologia.simuladospmmg.navigation"

    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    api(libs.koin.core)
    api(libs.koin.android)
    api(libs.koin.compose)

    implementation(libs.navigation.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.navigation.animation)
    implementation(libs.kotlin.reflect)
    implementation(libs.work.runtime.ktx)
    implementation(libs.kotlin.reflect)
}