rootProject.name = "artapp"
include("backend", "backend:api", "backend:common", "backend:domain", "backend:services", "backend:data-access", "backend:data-access-impl-jdbc", "backend:data-access-impl-spring")

pluginManagement {
    val springBootPluginVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings

    plugins {
        id("org.springframework.boot") version springBootPluginVersion
        id("io.spring.dependency-management") version springDependencyManagementPluginVersion
    }
}
