plugins {
    alias(libs.plugins.simuladospmmg.android.application)
    alias(libs.plugins.simuladospmmg.android.application.compose)
}

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
    /* compileOptions {
         sourceCompatibility = JavaVersion.VERSION_1_8
         targetCompatibility = JavaVersion.VERSION_1_8
     }*/
    /*kotlinOptions {
        jvmTarget = "1.8"
    }*/
    /* buildFeatures {
         compose = true
     }*/
    /*composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }*/
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(projects.designsystem)
    implementation(projects.feature.home)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.navigation.compose)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.junit.ktx)
    testImplementation(libs.testng)
    testImplementation(libs.testng)
    androidTestImplementation(libs.androidx.espresso.core)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.testManifest)
}