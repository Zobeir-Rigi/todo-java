package com.example.todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Allow CORS on all endpoints
                .allowedOrigins("http://127.0.0.1:5500")  // Allow frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow methods
                .allowedHeaders("*");  // Allow all headers
    }
}
