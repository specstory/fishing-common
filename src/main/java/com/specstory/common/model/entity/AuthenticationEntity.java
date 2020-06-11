package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "authentication")
public class AuthenticationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authentication_id")
    private Integer authenticationId;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "authentication_no")
    private String authenticationNo;

    @Column(name = "message")
    private String message;

    @Column(name = "send_datatime")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime sendDatatime;

    @Column(name = "expiration_datetime")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime expirationDatetime;

    @Column(name = "user_id")
    private String userId;

    @Column(columnDefinition="CHAR(1)", name = "use_yn", insertable = false)
    private String useYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="template_id")
    private AuthenticationTemplateEntity authenticationTemplateEntity;

}
