import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "com.lupine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://m2.dv8tion.net/releases")
    jcenter()
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("com.github.natanbc:lavadsp:0.7.4")
    compileOnly("com.sedmelluq:lavaplayer:1.3.78")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}