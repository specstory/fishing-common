package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name="authentication_template") // 매핑할 테이블 정보 명시
public class AuthenticationTemplateEntity {

  @Id // 기본키 매핑
   @Column(name = "template_id", nullable = false)
   private String templateId;

}
