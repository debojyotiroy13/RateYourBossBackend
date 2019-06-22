package com.debo.ninjacart.product.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JOB_REVIEWS")
public class JobReview extends BaseEntity {

    @Column(name="REVIEW_MESSAGE")
    private String message;

    @Column(name="REVIEW_RATING")
    private int rating;

    @OneToOne
    private Job job;


}
