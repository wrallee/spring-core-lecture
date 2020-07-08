package me.wrallee;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class SampleRunner implements ApplicationRunner {
    // 애플리케이션 실행 시 뭔가 실행할 수 있다.
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("foo in runner: " + args.containsOption("foo"));
        System.out.println("bar in runner: " + args.containsOption("bar"));
    }
}
