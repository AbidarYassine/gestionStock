package com.fstg.gestionStock.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)  // regarde creation date et lastModified date
public class AbstractEntity implements Serializable {


    private static final long serialVersionUID = -6793214527927635154L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @CreatedDate
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore
    private Date creationDate;

    @LastModifiedDate
    @Column(name = "lastUpdatedDate", nullable = true)
    @JsonIgnore
    private Date lastUpdatedDate;

}
