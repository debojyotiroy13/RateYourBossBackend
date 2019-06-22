package com.debo.ninjacart.product.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="JOB")
public class Job extends BaseEntity{

    @Column(name="JOB_NAME")
    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
