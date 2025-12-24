package com.example.FirstGameSpringProject.example.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//YourBusinessClass: using Field injection using reflection
@Component
class YourBusinessClass {
    Dep1 dep1;
    Dep2 dep2;

//    @Autowired
    public YourBusinessClass(Dep1 dep1, Dep2 dep2) {
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dep1 = dep1;
        this.dep2 = dep2;
    }
//    public Dep1 getDep1() {
//        return dep1;
//    }
//    @Autowired
//    public void setDep1(Dep1 dep1) {
//        System.out.println("Setter Injection - set Dep1");
//        this.dep1 = dep1;
//    }
//
//    public Dep2 getDep2() {
//        return dep2;
//    }
//
//    @Autowired
//    public void setDep2(Dep2 dep2) {
//        System.out.println("Setter Injection - set Dep2");
//        this.dep2 = dep2;
//    }

    public String toString() {
        return "Using " + dep1 + " and " + dep2;
    }

}
//Dep1
@Component
class Dep1 {

}
//Dep2
@Component
class Dep2 {

}

@Configuration
@ComponentScan("com.example.FirstGameSpringProject.example.a1")
public class DependencyInjectionLauncherApp {

    public static void main(String[] args) {

        try( var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}