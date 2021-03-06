plugins {
    `java-library`
    jacoco
}

group = "org.artapp.dataaccess.impl.jdbc"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    implementation(project(":backend:data-access"))
    implementation("org.postgresql:postgresql:42.2.14")
    implementation("org.slf4j:slf4j-api:1+")
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
}

tasks.test {
    useJUnitPlatform()
}
