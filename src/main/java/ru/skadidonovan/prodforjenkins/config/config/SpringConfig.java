package ru.skadidonovan.prodforjenkins.config.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("ru.skadidonovan.prodforjenkins")
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {

}
