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
public class GoodsCategoryEntity {
   @EmbeddedId
   private GoodsCategoryIdEntity goodsCategoryIdEntity;

   @Column(insertable = false, columnDefinition = "사용여부", length = 1)
   private String useYn;

   @Column(columnDefinition = "등록자", length = 20)
   private String registrantId;

   @Column(columnDefinition = "등록일시", insertable = false, updatable = false)
   @Temporal(TemporalType.TIMESTAMP)
   private Date registrationDatetime;

   @Column(columnDefinition = "수정자", length = 20)
   private String updateId;

   @Column(columnDefinition = "수정일시")
   @Temporal(TemporalType.TIMESTAMP)
   private Date updateDatetime;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="goods_Id", insertable=false, updatable=false)
//    GoodsEntity goods;  // <=== ReadOnly 설정

   @MapsId("goodsId")
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="goods_id")
   private GoodsEntity goodsEntity;
}
