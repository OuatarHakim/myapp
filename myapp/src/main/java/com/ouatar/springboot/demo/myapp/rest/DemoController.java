package com.ouatar.springboot.demo.myapp.rest;

import com.ouatar.springboot.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mycoach;


    @Autowired
    public  DemoController( @Qualifier("tennisCoach") Coach newCoach){
        System.out.println("In constructor "  + getClass().getSimpleName());
        this.mycoach = newCoach;
    }

    @GetMapping("/daillyworkout")
    public String getDailyWordkout(){
        return mycoach.getDailyWorkout();
    }


}
