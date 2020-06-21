package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name="goods_category") // 매핑할 테이블 정보 명시
public class GoodsCategoryEntity extends BaseEntity {
   @EmbeddedId
   private GoodsCategoryIdEntity goodsCategoryIdEntity;

   @MapsId("goodsId")
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="goods_id", columnDefinition = "CHAR(8)")
   private GoodsEntity goodsEntity;

   @MapsId("categoryId")
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="category_id", columnDefinition = "CHAR(4)")
   private CategoryEntity categoryEntity;
}
