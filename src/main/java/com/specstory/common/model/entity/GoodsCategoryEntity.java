package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name="goods_category") // 매핑할 테이블 정보 명시
public class GoodsCategoryEntity extends BaseEntity {
   @EmbeddedId
   private GoodsCategoryIdEntity goodsCategoryIdEntity;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="goods_Id", insertable=false, updatable=false)
//    GoodsEntity goods;  // <=== ReadOnly 설정

   @MapsId("goodsId")
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="goods_id")
   private GoodsEntity goodsEntity;
}
