package me.wrallee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello~");
        return "Hello Spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
