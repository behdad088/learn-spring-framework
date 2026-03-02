package com.spring.framework.learning.learn_spring_framework.enterprise.business;

import com.spring.framework.learning.learn_spring_framework.enterprise.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService{

    @Autowired
    private DataService dataService;

    public long calculateSum(){
        var data = dataService.getData();

        return data.stream().reduce(Integer::sum).get();
    }
}