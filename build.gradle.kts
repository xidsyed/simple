plugins {
    kotlin("jvm") version "2.0.20"
    `maven-publish`
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

dependencies {
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.example"
            artifactId = "simple"
            version = "0.1.0"

            from(components["java"])
        }
    }
}
