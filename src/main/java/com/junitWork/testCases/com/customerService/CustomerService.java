package com.junitWork.testCases.com.customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerService")
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public CustomerDao getCustomerDetails(){
        CustomerDao customerInfo=new CustomerDao("mikel","mieklle@email.com",22);
        return customerInfo;
    }
}



