package com.wahid.accounts;

import com.wahid.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = AccountsContactInfoDto.class)
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "Wahid Bank Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Abdul Wahid Jahangir",
                        email = "wahid@example.com",
                        url = "https://abdulwahidjahangir.netlify.app/"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://abdulwahidjahangir.netlify.app/"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Wahid Bank Accounts microservice REST API Documentation",
                url = "https://abdulwahidjahangir.netlify.app/"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }
}
