package dkrylov.petprojects.devschool.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration of required services
 */
@Configuration
@RequiredArgsConstructor
@PropertySource("classpath:application.properties")
public class ApiConfig {

    @Value("${base.path}")
    private String BASE_PATH;

    @Bean
    public RestTemplate restTemplate(){ return new RestTemplate(); }

    /**
     * Application API client
     *
     * @param restTemplate REST template
     * @return Application API
     */
    @Bean
    @Primary
    public dkrylov.petprojects.devschool.invoker.ApiClient schoolAppApiClient(RestTemplate restTemplate) {
        return new dkrylov.petprojects.devschool.invoker.ApiClient(restTemplate).setBasePath(BASE_PATH);
    }
}
