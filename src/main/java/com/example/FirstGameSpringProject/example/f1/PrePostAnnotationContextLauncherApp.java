package com.example.FirstGameSpringProject.example.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass (SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void intialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Clean Up");
    }
}



@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency.getReady could be to retrieve data from DB");
    }

}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApp {

    public static void main(String[] args) {

        try( var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}