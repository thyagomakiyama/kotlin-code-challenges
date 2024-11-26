plugins {
    kotlin("jvm") version "2.0.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set(project.findProperty("mainClass") as String? ?: "HelloKt")
}

tasks.named<JavaExec>("run") {
    val mainClassName = project.findProperty("mainClass") as String? ?: "HelloKt"
    mainClass.set(mainClassName)
}