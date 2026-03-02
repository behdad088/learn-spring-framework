package com.spring.framework.learning.learn_spring_framework.enterprise.example;

import com.spring.framework.learning.learn_spring_framework.enterprise.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;

    public long ReturnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}
