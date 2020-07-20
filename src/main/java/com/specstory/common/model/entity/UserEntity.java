package com.specstory.common.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "user_id", unique = true, nullable = false)
    private String userId;

    @Column(name = "password", columnDefinition = "CHAR(68)", nullable = false)
    private String password;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "sign_datetime", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime signDatetime;

    @Column(name = "tel_no")
    private String telNo;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "birth_day", columnDefinition = "CHAR(10)")
    private String birthDay;

    @Column(name = "sex", columnDefinition = "CHAR(1)")
    private String sex;

    @Column(name = "email")
    private String email;

    @Column(name = "zip_code", columnDefinition = "CHAR(5)")
    private String zipCode;

    @Column(name = "address")
    private String address;

    @Column(name = "address_detail")
    private String addressDetail;

    @Column(name = "fishing_type", columnDefinition = "CHAR(5)")
    private String fishingType;

    @Column(name = "use_yn", columnDefinition = "CHAR(1)", insertable = false)
    private String useYn;

    @Column(name = "dormancy_yn", columnDefinition = "CHAR(1)")
    private String dormancyYn;

    @Column(name = "dormancy_datetime")
   // @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dormancyDatetime;

    @Column(name = "secession_datetime")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime secessionDatetime;

    @Column(name = "password_change_datetime")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime passwordChangeDatetime;

    @Column(name = "login_failure")
    private int loginFailure;

    //@Column(name = "login_failure_datetime", columnDefinition = "등록일시", insertable = false, updatable = false)
    @Column(name = "login_failure_datetime")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime loginFailureDatetime;

    @OneToMany(mappedBy = "userEntity", fetch = FetchType.LAZY)
    Set<ComparisionCartEntity> comparisionCartEntities = new HashSet<>();

    @OneToMany(mappedBy = "userEntity", fetch = FetchType.LAZY)
    Set<WishListEntity> wishListEntities = new HashSet<>();

    @OneToMany(mappedBy = "userEntity", fetch = FetchType.LAZY)
    Set<LoginLogEntity> loginLogEntities = new HashSet<>();
}
