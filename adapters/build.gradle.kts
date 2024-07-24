plugins {
    id("org.springframework.boot") version "3.3.2"
    id("buildlogic.kotlin-application-conventions")
    id("io.spring.dependency-management") version "1.1.6"
    kotlin("plugin.jpa") version "1.9.24"
}

dependencies {
    // implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.2")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.2")
    implementation("org.springframework.boot:spring-boot-starter-webflux:3.3.2")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.17.2")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.2.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.8.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.2")
    testImplementation("io.projectreactor:reactor-test:3.6.8")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:2.0.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.3")
    implementation("org.apache.commons:commons-text:1.12.0")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass = "org.example.adapters.TodoApplicationKt"
}

tasks.withType<Test> {
    useJUnitPlatform()
}