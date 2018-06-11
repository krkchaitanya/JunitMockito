package com.junitWork.testCases.com.mockPractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class McokoneApplicationTest {

    @Mock
    private HelloService helloService;
    @InjectMocks
    private MockoneApplication  mockoneApplication;


    @Test
    public void testMockHandler() throws Exception{
        Mockito.when(helloService.hello()).thenReturn("hello");
        Mockito.verify(helloService).hello();
    }



}