package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "authentication_template")
public class AuthenticationTemplateEntity extends BaseEntity {

    @Id
    @Column
    private String templateId;

    @Column
    private String templateName;

    @Column
    private String authenticationType;

    @Column
    private String authenticationNoType;

    @Column
    private String serviceType;

    @Column
    private Integer effectiveTime;

    @Column
    private String templateMessage;

}
