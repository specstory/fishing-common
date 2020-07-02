package com.specstory.common.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Goods attribute template entity.
 */
@Getter
@Setter
@Entity
@Table(name = "goods_attribute_template")
public class GoodsAttributeTemplateEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_template_id", unique = true, nullable = false)
    private Integer attrTemplateId;

    @Column(name = "goods_type", columnDefinition = "CHAR(5)")
    private String goodsType;

    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_kor_name")
    private String attrKorName;

    @Column(name = "unit")
    private String unit;

    @Column(name = "orderNo")
    private int orderNo;

    @OneToMany(mappedBy = "goodsAttributeTemplateEntity", fetch = FetchType.LAZY)
    Set<GoodsAttributeEntity> goodsAttributeEntities = new HashSet<>();
}
