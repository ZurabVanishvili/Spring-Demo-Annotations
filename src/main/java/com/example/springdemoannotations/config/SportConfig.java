package com.example.springdemoannotations.config;

import com.example.springdemoannotations.coaches.Coach;
import com.example.springdemoannotations.coaches.SwimCoach;
import com.example.springdemoannotations.fortuneServices.FortuneService;
import com.example.springdemoannotations.fortuneServices.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.springdemoannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    //define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());

    }

    public static void main(String[] args) {


    }

}
