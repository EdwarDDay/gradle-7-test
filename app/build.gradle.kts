plugins {
    id("com.android.library")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.3"
}

afterEvaluate {
    tasks.named<org.gradle.jvm.tasks.Jar>("releaseSourcesJar") {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}
