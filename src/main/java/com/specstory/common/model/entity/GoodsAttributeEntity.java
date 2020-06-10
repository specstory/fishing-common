package com.specstory.common.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity //클래스와 테이블 매핑
@Table(name = "goods_attribute") // 매핑할 테이블 정보 명시
public class GoodsAttributeEntity {
    @Id // 기본키 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_kor_name")
    private String attrKorName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "unit")
    private String unit;

    @Column(name = "orderNo")
    private Integer orderNo;

    @Column(insertable = false)
    private String useYn;

    @Column
    private String registrantId;

    @Column(insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDatetime;

    @Column
    private String updateId;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date  updateDatetime;

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
