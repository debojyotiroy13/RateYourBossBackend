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

    @OneToMany
    private List<>
}
