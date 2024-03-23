plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.techmania.testphotoalbumwithjava"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.techmania.testphotoalbumwithjava"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    val room_version = "2.6.1"

    implementation(libs.room.runtime)
    annotationProcessor(libs.androidx.room.compiler)

    // To use Kotlin annotation processing tool (kapt)
    //kapt("androidx.room:room-compiler:$room_version")

    val lifecycle_version = "2.7.0"

    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel)
    // LiveData
    //implementation("androidx.lifecycle:lifecycle-livedata:$lifecycle_version")
    implementation(libs.androidx.lifecycle.livedata)
    // Annotation processor
    //annotationProcessor("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")
    annotationProcessor(libs.androidx.lifecycle.compiler)
}