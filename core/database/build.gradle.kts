plugins {
    alias(libs.plugins.simuladospmmg.android.library)
    alias(libs.plugins.simuladospmmg.android.room)
}

android {
    namespace = "com.ideatecnologia.simuladospmmg.database"
}

dependencies {

    implementation(libs.koin.android)

    implementation(libs.room.runtime)
    implementation(libs.room.ktx)

    implementation(libs.coroutines.android)
    implementation(libs.kotlinx.datetime)
    implementation(libs.androidx.junit.ktx)
}