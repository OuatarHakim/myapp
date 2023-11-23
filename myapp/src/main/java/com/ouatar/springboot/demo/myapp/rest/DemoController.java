package com.ouatar.springboot.demo.myapp.rest;

import com.ouatar.springboot.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mycoach;
    private  Coach anotherCoach;


    @Autowired
    public  DemoController( @Qualifier("tennisCoach") Coach newCoach, @Qualifier("tennisCoach") Coach newanotherCoach){
        System.out.println("In constructor "  + getClass().getSimpleName());
        this.mycoach = newCoach;
        this.anotherCoach = newanotherCoach;
    }

    @GetMapping("/daillyworkout")
    public String getDailyWordkout(){
        return mycoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return " Comparing beans : myCoach  == anothCoach , " + (mycoach == anotherCoach);
    }


}
