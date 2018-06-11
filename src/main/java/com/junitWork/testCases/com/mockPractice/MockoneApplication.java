package com.junitWork.testCases.com.mockPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mockone")
public class MockoneApplication {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public String mockHAndler()
    {
        return helloService.hello();
        //return "Calling mock one method in MockoneApplication";
    }
}
