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

//@Data
@Getter
@Setter
@Entity
@Table(name = "goods")
public class GoodsEntity extends BaseEntity {
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

    @Column(name = "goods_section", columnDefinition = "CHAR(5)")
    private String goodsSection;

    @Column(name = "goods_type", columnDefinition = "CHAR(5)")
    private String goodsType;

    @Column(name = "goods_name", columnDefinition = "상품명", length = 30)
    private String goodsName;

    @Column(name = "price", columnDefinition = "가격")
    private int price;

    @Column(name = "after_service", columnDefinition = "AS")
    private String afterService;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="brand_id", columnDefinition = "CHAR(5)")
    private BrandEntity brandEntity;

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<GoodsCategoryEntity> goodsCategoryEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<GoodsFishKindEntity> goodsFishKindEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<ReviewEntity> reviewEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<GoodsImageEntity> goodsImageEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<GoodsAttributeEntity> goodsAttributeEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<ComparisionCartEntity> comparisionCartEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<WishListEntity> wishListEntities = new HashSet<>();

    @OneToMany(mappedBy = "goodsEntity", fetch = FetchType.LAZY)
    Set<YoutubeEntity> youtubeEntities = new HashSet<>();
}
