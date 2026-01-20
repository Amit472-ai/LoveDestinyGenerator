package com.example.lovedestiny.service;

import com.example.lovedestiny.model.LoveResponse;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class LoveService {
    public LoveResponse calculateLove(String name1 , String name2){
        Random random = new Random();
        int score = random.nextInt(101);
        String destiny;

        if(score>80){
            destiny = "Perfect match ❤ destiny approves!";
        }
        else if(score>50){
            destiny = "Strong connection, thoda effort chahiye ✨";
        }
        else{
            destiny = "Cute bond hai, time decide karega 😄";
        }

        String couple = name1 + " ❤ " + name2;
        return new LoveResponse(couple,score,destiny);
    }

}
