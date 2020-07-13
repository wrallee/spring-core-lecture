package me.wrallee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    //==Using .properties directly==
    @Value("${wchan.name}")
    private String name;
    @Value("${wchan.age}")
    private int age;
    @Value("${wchan.fullName}")
    private String fullName;

    //=======Using Annotation=======
    @Autowired
    MyProperties myProperties;

    //=======Profile=======
    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==Using .properties directly==");
        System.out.println(name);
        System.out.println(age);
        System.out.println(fullName);

        System.out.println("=======Using Annotation=======");
        System.out.println(myProperties.getName());
        System.out.println(myProperties.getAge());
        System.out.println(myProperties.getSessionTimeout());

        System.out.println("=======Profile=======");
        System.out.println(hello);
    }
}
