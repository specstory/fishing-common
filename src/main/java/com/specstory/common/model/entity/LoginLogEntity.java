package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name="login_log") // 매핑할 테이블 정보 명시
public class LoginLogEntity {

  @Id // 기본키 매핑
  @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "log_Id", nullable = false)
   private long logId;

   @Column(name = "user_Id", nullable = false)
   private String userId;

   @Column(name = "login_Fail_Yn", nullable = false)
   private String loginFailYn;

   @Column(name = "login_Datetime", nullable = false)
   private java.sql.Timestamp loginDatetime;
}
