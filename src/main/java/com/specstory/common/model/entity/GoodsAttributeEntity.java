package com.specstory.common.model.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name = "goods_attribute") // 매핑할 테이블 정보 명시
public class GoodsAttributeEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_id", unique = true, nullable = false)
    private Integer attrId;

    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_kor_name")
    private String attrKorName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "unit")
    private String unit;

    @Column(name = "orderNo")
    private int orderNo;

    // 연관관계 매핑
//    @JsonIgnore //JSON 변환시 무한 루프 방지용
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private GoodsEntity goodsEntity;
////
//    public void updateGoods(GoodsEntity item){
//        this.goods = item;
//    }
}
