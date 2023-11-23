package com.ouatar.springboot.demo.myapp.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor "  + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Im a tennis coach";
    }
}
