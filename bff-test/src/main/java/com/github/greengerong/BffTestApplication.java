package com.github.greengerong;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableAutoConfiguration
@EnableFeignClients
public class BffTestApplication {

    @Autowired
    private CategoryService categoryService;

    public static void main(String[] args) {
        SpringApplication.run(BffTestApplication.class, args);
    }

    @RequestMapping("/categories")
    List<String> getCategoryNames() {
        return this.categoryService.getCategory()
                .stream()
                .map(t -> t.getCategoryName())
                .collect(Collectors.toList());

    }
}
