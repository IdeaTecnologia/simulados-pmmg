plugins {
    alias(libs.plugins.simuladospmmg.android.library)
    alias(libs.plugins.simuladospmmg.android.library.compose)
}

android {
    namespace = "com.ideatecnologia.simuladospmmg.designsystem"
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)

    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.material3.adaptive)
    api(libs.androidx.compose.material3.navigationSuite)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.util)
    implementation(libs.coil.kt.compose)
    implementation(libs.androidx.ui.text.google.fonts)

    testImplementation(libs.androidx.junit.ktx)
    testImplementation(libs.androidx.compose.ui.test)
    testImplementation(libs.androidx.compose.ui.testManifest)
    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
}