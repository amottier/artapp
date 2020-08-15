plugins {
    id("io.spring.dependency-management")
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply(plugin = "io.spring.dependency-management")
}