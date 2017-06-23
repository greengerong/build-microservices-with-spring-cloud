package com.github.greengerong;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProductApplication {

    @Value("${config.message: no message}")
    private String message;

    @RequestMapping("/categories")
    List<Category> categories() throws InterruptedException {
        return Arrays.asList(
                new Category(1, "T-Shirt"),
                new Category(2, "Mobile Phone"),
                new Category(3, "Food"));
    }

    @RequestMapping("/config")
    public String config() {
        return this.message;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceProductApplication.class, args);
    }
}

