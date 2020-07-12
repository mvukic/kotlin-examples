import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4-M3"
    application
}
group = "com.mvukic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}


dependencies {
    implementation(kotlin("stdlib-jdk8"))
}


tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

tasks.withType<Wrapper>() {
    gradleVersion = "6.5.1"
}

application {
    mainClassName = "MainKt"
}