package main.java.com.jm_estacionamento.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API do Sistema de Estacionamento")
                .description("Documentação da API RESTful para gestão de estacionamento")
                .version("v1.0")
                .contact(new Contact()
                    .name("Armando Eduardo Massingue")
                    .email("armandoemzansi@gmail.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Repositório GitHub")
                        .url("https://github.com/ArmandoMassingue2/SISTEMA-DE-GESTAO-DE-ESTACIONAMENTO"));
    }
}
