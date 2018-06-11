package com.junitWork.testCases.com.mockPractice;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String hello(){
        return "hello method calling form helloService";
    }

}
