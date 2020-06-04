package com.specstory.common.model.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.specstory.common.util.StringPrefixedSequenceIdGenerator;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name = "goods") // 매핑할 테이블 정보 명시
public class GoodsEntity   {
/*    @Builder
    public GoodsEntity(String goodsId, String brandId, String goodsName, int price, String afterService
            , List<GoodsAttributeEntity> goodsAttributes
            , List<GoodsCategoryEntity> goodsCategory
            , List<GoodsImageEntity> goodsImage) {
        this.goodsId = goodsId;
        this.brandId = brandId;
        this.goodsName= goodsName;
        this.price = price;
        this.afterService = afterService;
    }*/

    @Id // 기본키 매핑
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goods_seq")
    @GenericGenerator(
            name = "goods_seq",
            strategy = "com.specstory.common.util.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "G"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%07d") })
    @Column(name = "goods_id", length = 8, nullable = false, columnDefinition = "상품아이디")
    private String goodsId;

    @Column(name = "goods_name", columnDefinition = "상품명", length = 30)
    private String goodsName;

    @Column(name = "price", columnDefinition = "가격")
    private int price;

    @Column(name = "after_service", columnDefinition = "AS")
    private String afterService;

    @Column(name = "use_yn", columnDefinition = "사용여부", length =  1)
    private String useYn;

    @Column(columnDefinition = "등록자", length = 20)
    private String registrantId;

    @Column(columnDefinition = "등록일시", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date registrationDatetime;

    @Column(columnDefinition = "수정자", length = 20)
    private String updateId;

    @Column(columnDefinition = "수정일시")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDatetime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="brand_id")
    private BrandEntity brandEntity;

    //@JsonIgnoreProperties("goods")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id")
    List<GoodsImageEntity> goodsImages = new ArrayList<>();
}
