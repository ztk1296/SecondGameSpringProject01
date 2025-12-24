package com.example.FirstGameSpringProject.example.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldContextLauncher {

    public static void main(String[] args) {

        try ( var context = new AnnotationConfigApplicationContext(RealWorldContextLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            //output: 55
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
