package me.wrallee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Value("${wchan.name}")
    private String name;

    @Value("${wchan.age}")
    private int age;

    @Value("${wchan.fullName}")
    private String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(name);
        System.out.println(age);
        System.out.println(fullName);
    }
}
