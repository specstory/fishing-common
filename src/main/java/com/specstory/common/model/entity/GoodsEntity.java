package com.specstory.common.model.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.specstory.common.util.StringPrefixedSequenceIdGenerator;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.*;

@NoArgsConstructor
@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name = "goods") // 매핑할 테이블 정보 명시
public class GoodsEntity extends BaseEntity {
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

    // 상품아이디
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goods_seq")
    @GenericGenerator(
            name = "goods_seq",
            strategy = "com.specstory.common.util.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "G"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%07d") })
    @Column(name = "goods_id", columnDefinition="CHAR(8)", unique = true, nullable = false)
    private String goodsId;

    @Column(name = "goods_name", columnDefinition = "상품명", length = 30)
    private String goodsName;

    @Column(name = "price", columnDefinition = "가격")
    private int price;

    @Column(name = "after_service", columnDefinition = "AS")
    private String afterService;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="brand_id")
    private BrandEntity brandEntity;

    //@JsonIgnoreProperties("goods")
    //@OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<GoodsAttributeEntity> goodsAttributeEntities = new HashSet<>();

   //@JsonIgnoreProperties("goods")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id")
    List<GoodsImageEntity> goodsImages = new ArrayList<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<ReviewEntity> reviewEntities = new HashSet<>();
}
