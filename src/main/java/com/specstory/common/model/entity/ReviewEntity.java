package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Entity //클래스와 테이블 매핑
@Table(name="review") // 매핑할 테이블 정보 명시
public class ReviewEntity {

   @Id // 기본키 매핑
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "review_Id", nullable = false)
   private String reviewId;

   @Column(name = "score", nullable = false)
   private String score;

   @Column(name = "advantage", nullable = false)
   private String advantage;

   @Column(name = "weakness", nullable = false)
   private String weakness;

   @Column(name = "tip", nullable = false)
   private String tip;

   @Column(name = "registrant_Id", nullable = false)
   private String registrantId;

   @Column(name = "registration_Datetime", nullable = false)
   private String registrationDatetime;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "goods_id")
   private GoodsEntity goodsEntity;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id")
   private UserEntity userEntity;
}
