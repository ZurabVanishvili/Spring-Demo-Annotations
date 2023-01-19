package com.example.springdemoannotations.coaches;

import com.example.springdemoannotations.fortuneServices.FortuneService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneServiceField;

    //default no-arg constructor

    public TennisCoach() {
        System.out.println(">>Called no-arg constructor");
    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        fortuneServiceField = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServiceField.getFortune();
    }

    //define a setter method
//    @Autowired
//    public void anotherNameToSetFortuneService(FortuneService fortuneServiceField) {
//        System.out.println(">>Called setter method");
//        this.fortuneServiceField = fortuneServiceField;
//    }

    //define init method
    @PostConstruct
    public void doMyStartup() {
        System.out.println("Init method has been called");
    }

    //define destroy method
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy method has been called");
    }
}
