package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="review")
public class ReviewEntity extends BaseEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "review_id", unique = true, nullable = false)
   private Integer reviewId;

   @Column
   private int score;

   @Column
   private String advantage;

   @Column
   private String weakness;

   @Column
   private String tip;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "goods_id")
   private GoodsEntity goodsEntity;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id")
   private UserEntity userEntity;

   @OneToMany(mappedBy = "reviewEntity", fetch = FetchType.LAZY)
   Set<ReviewImageEntity> reviewImageEntities = new HashSet<>();
}
