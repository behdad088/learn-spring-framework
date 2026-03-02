package com.spring.framework.learning.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements IGamingConsole {

    public void Up(){
        System.out.println("Pacman up");
    }
    public void Down(){
        System.out.println("Pacman down");
    }
    public void Left(){
        System.out.println("Pacman left");
    }
    public void Right(){
        System.out.println("Pacman right");
    }
}
