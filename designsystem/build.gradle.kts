plugins {
    alias(libs.plugins.simuladospmmg.android.library)
    alias(libs.plugins.simuladospmmg.android.library.compose)
}

android {
    namespace = "com.ideatecnologia.designsystem"
}

dependencies {
    implementation(libs.androidx.junit.ktx)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.junit.ktx)
    // implementation(libs.bundles.androidx)
    // testImplementation(libs.bundles.test)
    // androidTestImplementation(libs.bundles.uiTest)
}