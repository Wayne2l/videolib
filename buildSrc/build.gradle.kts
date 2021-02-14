plugins {
    `kotlin-dsl`
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

repositories {
    google()
    jcenter()
}

dependencies {
    compileOnly(gradleApi())
    implementation("com.android.tools.build:gradle:4.1.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
}