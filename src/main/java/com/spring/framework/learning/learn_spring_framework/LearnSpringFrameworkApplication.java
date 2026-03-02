package com.spring.framework.learning.learn_spring_framework;

import com.spring.framework.learning.learn_spring_framework.enterprise.example.MyWebController;
import com.spring.framework.learning.learn_spring_framework.game.GameRunner;
import com.spring.framework.learning.learn_spring_framework.game.MarioGame;
import com.spring.framework.learning.learn_spring_framework.game.PacManGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.package1", "com.Package2"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args)
	{
		var context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		var gameRunner = context.getBean(GameRunner.class);
		gameRunner.Run();

		var controller = context.getBean(MyWebController.class);
		System.out.println(controller.ReturnValueFromBusinessService());
	}
}
