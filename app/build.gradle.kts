plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.tasklist"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.tasklist"
        minSdk = 25
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Dependencia directa de Lottie
    implementation("com.airbnb.android:lottie:6.4.0")

    // Dependencia de ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Otras dependencias necesarias
    testImplementation(libs.junit) // JUnit para pruebas unitarias
    androidTestImplementation(libs.androidx.junit) // JUnit para pruebas de UI
    androidTestImplementation(libs.androidx.espresso.core) // Espresso para UI Testing

    implementation("androidx.navigation:navigation-fragment-ktx:2.5.0")  // Cambia a la versión más reciente si es necesario
    implementation("androidx.navigation:navigation-ui-ktx:2.5.0")  // Cambia a la versión más reciente si es necesario

}
