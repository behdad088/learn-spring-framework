package com.spring.framework.learning.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private IGamingConsole gamingConsole;

    public GameRunner(IGamingConsole gamingConsole)
    {
        this.gamingConsole = gamingConsole;
    }

    public void Run()
    {
        gamingConsole.Up();
        gamingConsole.Down();
        gamingConsole.Left();
        gamingConsole.Right();

    }
}
