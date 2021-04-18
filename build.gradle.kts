buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
    }
}

plugins {
    kotlin("android") version "1.4.32" apply false
}
