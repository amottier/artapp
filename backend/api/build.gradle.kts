plugins {
    `java-library`
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "org.artapp.api"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    implementation(project(":backend:domain")) {
        because("To get the POJO definition")
    }
    implementation(project(":backend:services")) {
        because("To be able to fetch/update data from storage")
    }
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

tasks.test {
    useJUnitPlatform()
}
