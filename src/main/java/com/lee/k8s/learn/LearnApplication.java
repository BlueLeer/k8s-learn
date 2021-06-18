package com.lee.k8s.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @date 2021/6/19 1:00
 */
@SpringBootApplication
@RestController
public class LearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return String.format("%s:%s", System.currentTimeMillis(), "hello");
    }
}
