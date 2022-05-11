plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13")
    testImplementation("org.assertj:assertj-core:3.15.0")
}

tasks.test{
    useJUnit()
}