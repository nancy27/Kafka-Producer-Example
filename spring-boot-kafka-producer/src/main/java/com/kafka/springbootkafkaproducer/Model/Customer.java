package com.kafka.springbootkafkaproducer.Model;

public class Customer {
    private String userName;
    private String dept;
    private Integer Salary;

    public Customer() {
    }

    public Customer(String userName, String dept, Integer salary) {
        this.userName = userName;
        this.dept = dept;
        Salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }
}
