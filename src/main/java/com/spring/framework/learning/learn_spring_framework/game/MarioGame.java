package com.spring.framework.learning.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements IGamingConsole {
    public void Up(){
        System.out.println("up");
    }
    public void Down(){
        System.out.println("down");
    }
    public void Left(){
        System.out.println("left");
    }
    public void Right(){
        System.out.println("right");
    }
}
