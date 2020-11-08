import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.john_"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    implementation("org.example:lib:1.0-SNAPSHOT")
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}