package com.junitWork.testCases.com.mockPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mockone")
public class MockoneApplication {

    @GetMapping
    public String mockHAndler()
    {
        return "Calling mock one method in MockoneApplication";
    }
}
