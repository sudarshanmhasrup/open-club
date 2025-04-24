import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

java {
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/kotlinBasics"))