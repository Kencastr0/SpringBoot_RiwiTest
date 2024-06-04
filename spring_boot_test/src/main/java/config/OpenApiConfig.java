package config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Sistema de gestión de encuestas para Riwi",
        version = "1.0",
        description = "Permite a Riwi almacenar y gestionar\r\n" + //
                    "de manera eficientemente el banco de preguntas de las encuestas, manteniendo la\r\n" + //
                    "relación entre entre las encuentras, sus preguntas y opciones de respuesta.\r"
    )
)
public class OpenApiConfig {
    
}
