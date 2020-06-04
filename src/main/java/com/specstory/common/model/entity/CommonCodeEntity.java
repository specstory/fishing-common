package com.specstory.common.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name="common_code") // 매핑할 테이블 정보 명시
public class CommonCodeEntity {

  @Id // 기본키 매핑
   @Column(name = "code", nullable = false)
   private String code;

   @Column(name = "code_Type", nullable = true)
   private String codeType;

   @Column(name = "code_Upper", nullable = true)
   private String codeUpper;

   @Column(name = "code_Name", nullable = false)
   private String codeName;

   @Column(name = "code_Value", nullable = true)
   private String codeValue;

   @Column(name = "code_Description", nullable = true)
   private String codeDescription;

   @Column(name = "order_No", nullable = true)
   private long orderNo;

   @Column(name = "use_Yn", nullable = true)
   private String useYn;

   @Column(name = "registrant_Id", nullable = true)
   private String registrantId;

   @Column(name = "update_Id", nullable = true)
   private String updateId;

}
