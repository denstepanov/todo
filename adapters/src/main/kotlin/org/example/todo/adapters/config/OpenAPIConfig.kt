package org.example.todo.adapters.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

// TODO: прокидывать значения из gradle.properties
// https://docs.gradle.org/current/userguide/build_environment.html
@Configuration
open class OpenAPIConfig {
    @Bean
    open fun openAPI(): OpenAPI {
        return OpenAPI().info(Info().title("TODO App API").version("v1.0.0"))
        // TODO: перезаписать префикс.
    }
}