package com.debo.ninjacart.product.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="COMPANY")
public class Company extends BaseEntity{

    @Column(name="COMPANY_NAME")
    private String name;

    @Column(name="COMPANY_LOCATION")
    private String location;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Job> jobs;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<CompanyReview> reviews;

    public List<CompanyReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<CompanyReview> reviews) {
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
