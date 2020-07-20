package com.specstory.common.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CommonCodeEntity
 */
@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name="common_code") // 매핑할 테이블 정보 명시
public class CommonCodeEntity extends BaseEntity {

   @Id // 기본키 매핑
   @Column(name = "code", columnDefinition="CHAR(5)", unique = true, nullable = false, length = 5)
   private String code;

   @Column(name = "code_Type", nullable = false)
   private String codeType;

   @Column(name = "code_Upper", columnDefinition="CHAR(5)")
   private String codeUpper;

   @Column(name = "code_Name", nullable = false)
   private String codeName;

   @Column(name = "code_Value")
   private String codeValue;

   @Column(name = "code_Description")
   private String codeDescription;

   @Column(name = "order_No")
   private int orderNo;

}
