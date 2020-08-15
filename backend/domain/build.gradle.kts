plugins {
    `java-library`
}

group = "org.artapp.domain"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
}

tasks.test {
    useJUnitPlatform()
}