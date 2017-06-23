package com.github.greengerong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class InfraZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfraZuulApplication.class, args);
    }
}
