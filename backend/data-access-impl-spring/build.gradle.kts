plugins {
    `java-library`
}

group = "org.artapp.dataaccess.impl.spring"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    implementation(project(":backend:data-access"))
    //implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.slf4j:slf4j-api:1+")
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
}

tasks.test {
    useJUnitPlatform()
}

