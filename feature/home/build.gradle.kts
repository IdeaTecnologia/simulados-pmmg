plugins {
    alias(libs.plugins.simuladospmmg.android.library.compose)
    alias(libs.plugins.simuladospmmg.android.feature)
}

android {
    namespace = "com.ideatecnologia.home"

    /*defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }*/

    /*buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }*/
}

dependencies {
    implementation(projects.designsystem)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.junit.ktx)

    debugImplementation(libs.androidx.ui.tooling)
    testImplementation(libs.junit)
}