package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "psssword", nullable = false)
    private String psssword;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "sign_datetime", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date signDatetime;

    @Column(name = "tel_no")
    private String telNo;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "birth_day")
    private String birthDay;

    @Column(name = "sex")
    private String sex;

    @Column(name = "email")
    private String email;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "address")
    private String address;

    @Column(name = "address_detail")
    private String addressDetail;

    @Column(name = "fishing_type")
    private String fishingType;

    @Column(name = "use_yn", insertable = false)
    private String useYn;

    @Column(name = "dormancy_yn")
    private String dormancyYn;

    @Column(name = "dormancy_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dormancyDatetime;

    @Column(name = "secession_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date secessionDatetime;

    @Column(name = "password_change_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passwordChangeDatetime;

    @Column(name = "login_failure")
    private long loginFailure;

    //@Column(name = "login_failure_datetime", columnDefinition = "등록일시", insertable = false, updatable = false)
    @Column(name = "login_failure_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginFailureDatetime;
}
