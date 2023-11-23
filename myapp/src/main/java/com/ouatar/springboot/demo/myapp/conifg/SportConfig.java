package com.ouatar.springboot.demo.myapp.conifg;

import com.ouatar.springboot.demo.myapp.common.Coach;
import com.ouatar.springboot.demo.myapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
