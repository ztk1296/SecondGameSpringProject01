package com.example.FirstGameSpringProject.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.FirstGameSpringProject.game")
public class GamingAppLauncherApp {

    public static void main(String[] args) {

        try( var context = new AnnotationConfigApplicationContext(GamingAppLauncherApp.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}