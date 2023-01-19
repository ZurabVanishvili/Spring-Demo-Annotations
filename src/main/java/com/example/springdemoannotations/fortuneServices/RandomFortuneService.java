package com.example.springdemoannotations.fortuneServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create an array of string
    private final String[] data = {
            "Good luck", "Normal day", "Bad luck"
    };

    //make a random field
    private final Random random = new Random();

    @Override
    public String getFortune() {
        //pick up random string from array
        int index = random.nextInt(data.length);
        return data[index];
    }
}
