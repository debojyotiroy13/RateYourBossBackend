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

    @Column(name = "deleted", columnDefinition = "Bit(1) default false")
    private boolean deleted = false;

    @Column(name="CREATE_DATE", nullable = false)
    private Date createDate;

    @Column(name="MODIFY_DATE", nullable = false)
    private Date modifyDate;

    @PrePersist
    protected void prePersist() {
        if (this.createDate == null) createDate = new Date();
        if (this.modifyDate == null) modifyDate = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.modifyDate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
