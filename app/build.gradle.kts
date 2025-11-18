plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.vigyan.coaching"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.vigyan.coaching"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Room
    implementation("androidx.room:room-runtime:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // WorkManager
    implementation("androidx.work:work-runtime-ktx:2.8.1")

    // Coil
    implementation("io.coil-kt:coil:2.3.0")

    // Firebase (placeholders)
    implementation("com.google.firebase:firebase-firestore-ktx:24.7.0")
    implementation("com.google.firebase:firebase-auth-ktx:22.1.1")
}

// NOTE: Add google-services plugin and google-services.json when you enable Firebase.
