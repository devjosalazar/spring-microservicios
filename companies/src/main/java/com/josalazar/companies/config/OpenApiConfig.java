package com.josalazar.companies.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "MicroServices Company Crud",
                version = "1.0.0.",
                description = "This is a Crud for management companies"
        )
)
public class OpenApiConfig {
}
