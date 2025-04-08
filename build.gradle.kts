// build.gradle.kts (Proyecto)
plugins {
    // Plugins de nivel superior
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

subprojects {
    repositories {
        google()
        mavenCentral()
    }
}
