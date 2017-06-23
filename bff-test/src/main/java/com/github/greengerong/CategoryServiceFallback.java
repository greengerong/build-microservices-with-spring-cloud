package com.github.greengerong;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

/******************************************
 *                                        *
 * Auth: green gerong                     *
 * Date: 2017                             *
 * blog: http://greengerong.github.io/    *
 * github: https://github.com/greengerong *
 *                                        *
 ******************************************/
@Component
public class CategoryServiceFallback implements CategoryService {
    @Override
    public List<Category> getCategory() {
        return Collections.emptyList();
    }
}
