import com.android.build.gradle.ProguardFiles

plugins {
  id("com.android.library")
  id("kotlin-android")
}

android {
  compileSdkVersion(30)
  buildToolsVersion("30.0.2")
  ndkVersion = "21.3.6528147"

  dexOptions {
    jumboMode = true
  }

  defaultConfig {
    minSdkVersion(16)
    targetSdkVersion(30)
    versionCode = 1
    versionName = "1.0"
  }

  buildTypes {
    getByName("release")  {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile(ProguardFiles.ProguardFile.OPTIMIZE.fileName),
        "proguard-rules.pro"
      )
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_1_8.toString()
  }
}

dependencies {
  implementation("androidx.annotation:annotation:1.1.0")
}