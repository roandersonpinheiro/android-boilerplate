plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.devtools.ksp") version ("1.9.0-1.0.12")
}

android {
    namespace = "com.example.androidboilerplate"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidboilerplate"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
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
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packagingOptions {
        resources {
            excludes += ("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    ksp {
        arg("room.schemaLocation", "$projectDir/schemas")
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose:compose-bom:2023.09.01")
    implementation("androidx.compose.ui:ui:1.5.1")
    implementation("androidx.compose.ui:ui-graphics:1.5.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.1")
    implementation("androidx.compose.material3:material3:1.1.2")
    implementation("androidx.compose.ui:ui-util:1.5.1")

    implementation("androidx.collection:collection-ktx:1.2.0")
    implementation("androidx.palette:palette-ktx:1.0.0")

    //Navigation
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.3")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.3")

    //Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0-alpha02")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0-alpha02")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")


    //Retrofit & OkHttp
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    //MockWebServer
    testImplementation("com.squareup.okhttp3:mockwebserver:4.11.0")

    // Room
    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")
    ksp("androidx.room:room-compiler:2.5.2")
    annotationProcessor("androidx.room:room-compiler:2.5.2")
    androidTestImplementation("androidx.room:room-testing:2.5.2")

    //Moshi (JSON mapping)
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    // Koin
    implementation("io.insert-koin:koin-core:3.5.0")
    implementation("io.insert-koin:koin-annotations:1.0.0-beta-1")
    ksp("io.insert-koin:koin-ksp-compiler:1.0.0-beta-1")


    implementation("androidx.work:work-runtime-ktx:2.8.1")

    // For instrumentation tests
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose:compose-bom:2023.09.01")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.5.1")

    // For local unit tests
    testImplementation("com.google.dagger:hilt-android-testing:2.48")
    testAnnotationProcessor("com.google.dagger:hilt-compiler:2.48")
    testImplementation("junit:junit:4.13.2")
    testImplementation("io.insert-koin:koin-test:3.5.0")
    testImplementation("io.insert-koin:koin-test-junit4:3.5.0")

    //Mock Test
    testImplementation("io.mockk:mockk:1.13.7")
    androidTestImplementation("io.mockk:mockk-android:1.13.7")

    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}