package com.debo.ninjacart.product.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.SerializablePermission;
import java.util.Date;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(
            generator = "system-uuid"
)
    @GenericGenerator(
            name = "system-uuid",
            strategy = "uuid"
    )
    @Basic(
            optional = false
    )
    @Column(
            name = "GUID",
            unique = true,
            nullable = false,
            length = 50
    )
    private String id;

    @Column(name="CREATE_DATE")
    private Date createDate;

    @Column(name="MODIFY_DATE")
    private Date modifyDate;

}
