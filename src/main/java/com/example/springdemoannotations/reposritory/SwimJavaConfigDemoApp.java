package com.example.springdemoannotations.reposritory;

import com.example.springdemoannotations.coaches.SwimCoach;
import com.example.springdemoannotations.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println("Task: " + coach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println("Fortune: " + coach.getDailyFortune());

        //call getter methods
        System.out.println("Email: " + coach.getEmail());

        System.out.println("Team: " + coach.getTeam());

        //close the context
        context.close();

    }
}
