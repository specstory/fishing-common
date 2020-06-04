package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name="user") // 매핑할 테이블 정보 명시
public class UserEntity {

  @Id // 기본키 매핑
  @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "user_Id", nullable = false)
   private String userId;

   @Column(name = "pwd", nullable = false)
   private String pwd;

   @Column(name = "user_Name", nullable = false)
   private String userName;
}
