package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Employee {
    private Long id;
    private String name;
    private String mobileNo;
    private Long salary;

    public Employee() { }

    public Employee(Long id, String name, String mobileNo, Long salary) {
        this.id= id;
        this.name= name;
        this.mobileNo= mobileNo;
        this.salary= salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
