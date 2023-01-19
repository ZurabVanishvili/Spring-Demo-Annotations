package com.example.springdemoannotations.fortuneServices;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Rest Fortune";
    }
}
