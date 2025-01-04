plugins {
    alias(libs.plugins.simuladospmmg.android.library.compose)
    alias(libs.plugins.simuladospmmg.android.feature)
}

android {
    namespace = "com.ideatecnologia.simuladospmmg.home"
}

dependencies {
    implementation(projects.core.navigation)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.navigation.common.ktx)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.navigation.compose)

    debugImplementation(libs.androidx.ui.tooling)
    testImplementation(libs.junit)
    testImplementation(libs.androidx.junit.ktx)
}