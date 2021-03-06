plugins {
    `java-library`
}

group = "org.artapp.services"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    implementation(project(":backend:domain"))
    implementation(project(":backend:data-access"))
    implementation(project(":backend:data-access-impl-jdbc"))
    implementation("org.slf4j:slf4j-api:1+")
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
}

tasks.test {
    useJUnitPlatform()
}
