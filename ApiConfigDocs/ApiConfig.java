package projectloginclient.apicrud.ApiConfigDocs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Restful Api crud login Spring Boot 3.1.0")
                        .version("v1")
                        .description("Api de criação de login")
                        .termsOfService("https://login")
                        .license(new
                                License()
                                .name("Apache 2.0")
                                .url("https://login")));

    }
}
