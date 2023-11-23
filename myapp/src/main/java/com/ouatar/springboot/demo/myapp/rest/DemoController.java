package com.ouatar.springboot.demo.myapp.rest;

import com.ouatar.springboot.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mycoach;




    @GetMapping("/daillyworkout")
    public String getDailyWordkout(){
        return mycoach.getDailyWorkout();
    }

    @Autowired
    public void setMycoach(Coach newCoach){
        this.mycoach = newCoach;
    }
}
