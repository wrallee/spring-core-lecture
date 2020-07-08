package me.wrallee;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleArgumentsReader {
    // 생성자를 통해 bean을 주입받을 수 있다.
    public SampleArgumentsReader(ApplicationArguments arguments) {
        System.out.println("foo: " + arguments.containsOption("foo"));
        System.out.println("bar: " + arguments.containsOption("bar"));
    }
}
