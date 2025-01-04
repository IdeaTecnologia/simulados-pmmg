plugins {
    alias(libs.plugins.simuladospmmg.android.application)
    alias(libs.plugins.simuladospmmg.android.application.compose)
    alias(libs.plugins.simuladospmmg.android.application.firebase)
    // id("com.google.android.gms.oss-licenses-plugin")
    // alias(libs.plugins.simuladospmmg.koin)
}

// Aplica o plugin OSS Licenses do Google, que permite gerar uma tela de licenças de código aberto
// para as bibliotecas utilizadas no aplicativo. Este plugin deve ser aplicado manualmente,
// pois não está disponível no Gradle Plugin Portal.
apply(plugin = "com.google.android.gms.oss-licenses-plugin")

android {
    namespace = "com.ideatecnologia.simuladospmmg"

    defaultConfig {
        applicationId = "com.ideatecnologia.simuladospmmg"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        buildConfig = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(projects.designsystem)
    implementation(projects.feature.home)
    implementation(projects.core.database)
    implementation(projects.core.navigation)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.firestore.ktx)
    implementation(libs.google.oss.licenses)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.navigation.compose)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.datastore.core.android)
    implementation(libs.androidx.core.splashscreen)

    // Koin
    implementation(libs.koin.workmanager)
    implementation(libs.koin.compose)

    // Testes
    testImplementation(libs.androidx.junit.ktx)
    testImplementation(libs.testng)
    testImplementation(libs.koin.test)

    androidTestImplementation(libs.androidx.espresso.core)

    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.testManifest)
}