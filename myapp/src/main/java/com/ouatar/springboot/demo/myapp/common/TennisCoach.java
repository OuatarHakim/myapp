package com.ouatar.springboot.demo.myapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor "  + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Im a tennis coach";
    }
}
