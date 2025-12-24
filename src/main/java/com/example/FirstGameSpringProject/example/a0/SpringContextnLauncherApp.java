package com.example.FirstGameSpringProject.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
//@ComponentScan("com.example.FirstGameSpringProject.example.a1")
public class SpringContextnLauncherApp {

    public static void main(String[] args) {

        try( var context = new AnnotationConfigApplicationContext(SpringContextnLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}