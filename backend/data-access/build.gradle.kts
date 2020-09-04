plugins {
    `java-library`
    jacoco
}

group = "org.artapp.dataccess"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    api(project(":backend:domain"))
    implementation("org.slf4j:slf4j-api:1+")
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
}

tasks.test {
    useJUnitPlatform()
}

