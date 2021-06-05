package me.sieun;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(HelloController.class))
public class AppConfig {

}