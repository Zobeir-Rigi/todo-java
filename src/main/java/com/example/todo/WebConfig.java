package com.example.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS for all origins
        registry.addMapping("/**").allowedOrigins("http://127.0.0.1:5500");  // Frontend location (could be a different URL in your case)
    }
}
