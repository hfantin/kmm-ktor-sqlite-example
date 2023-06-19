buildscript {
    val sqlDelightVersion = "1.5.5"
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.0.2").apply(false)
    id("com.android.library").version("8.0.2").apply(false)
    kotlin("android").version("1.8.21").apply(false)
    kotlin("multiplatform").version("1.8.21").apply(false)
//    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
