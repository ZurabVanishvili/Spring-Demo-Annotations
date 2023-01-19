package com.example.springdemoannotations.reposritory;

import com.example.springdemoannotations.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean result = coach2 == coach;

        //print out the result
          System.out.println("\nPointing to the same object : " + result);

        System.out.println("Memory location for coach : " + coach);

        System.out.println("Memory location for coach2 : " + coach2);


        //close the context
        context.close();

    }
}
