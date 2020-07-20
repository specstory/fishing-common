package com.specstory.common.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
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
