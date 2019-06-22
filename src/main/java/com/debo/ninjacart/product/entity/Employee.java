package com.debo.ninjacart.product.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="EMPLOYEE")
public class Employee extends BaseEntity{

    @Column(name="EMPLOYEE_NAME")
    private String name;

    @Column(name="EMPLOYEE_OVERALL_RATING")
    private int rating;

    @Column(name="EMPLOYEE_DESIGNATION")
    private String designation;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<EmployeeReview> reviews;

    public List<EmployeeReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<EmployeeReview> reviews) {
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
