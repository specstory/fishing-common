package com.specstory.common.model.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity //클래스와 테이블 매핑
@Table(name="authentication") // 매핑할 테이블 정보 명시
public class AuthenticationEntity {

   @Id
   @Column(name = "authentication_id")
   private Integer authenticationId;

   @Column(name = "template_id", nullable = false)
   private String templateId;

   @Column(name = "phone_no")
   private String phoneNo;

   @Column(name = "authentication_no")
   private String authenticationNo;

   @Column(name = "message")
   private String message;

   @Column(name = "send_datatime")
   private java.sql.Timestamp sendDatatime;

   @Column(name = "expiration_datetime")
   private java.sql.Timestamp expirationDatetime;

   @Column(name = "user_id")
   private String userId;

   @Column(name = "use_yn")
   private String useYn;
}
