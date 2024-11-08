plugins {
    kotlin("jvm") version "2.0.20"
    `java-library`
}

group = "org.example"
version = "0.1.0"

repositories {
    mavenCentral()
}


tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.MainKt"
    }
}
q
dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}