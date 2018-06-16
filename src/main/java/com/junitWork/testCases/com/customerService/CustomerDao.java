package com.junitWork.testCases.com.customerService;

public class CustomerDao {

    public String name;
    public String email;
    public int age;

    public CustomerDao(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerDao{" +
                "name=" + name +
                ", email=" + email +
                ", age=" + age +
                '}';
    }
}
