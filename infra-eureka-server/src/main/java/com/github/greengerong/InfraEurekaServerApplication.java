package com.github.greengerong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InfraEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfraEurekaServerApplication.class, args);
    }
}
