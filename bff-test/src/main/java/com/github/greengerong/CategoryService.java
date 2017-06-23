package com.github.greengerong;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/******************************************
 *                                        *
 * Auth: green gerong                     *
 * Date: 2017                             *
 * blog: http://greengerong.github.io/    *
 * github: https://github.com/greengerong *
 *                                        *
 ******************************************/

@FeignClient(value = "service-product", fallback = CategoryServiceFallback.class)
public interface CategoryService {

    @GetMapping("/categories")
    List<Category> getCategory();
}
