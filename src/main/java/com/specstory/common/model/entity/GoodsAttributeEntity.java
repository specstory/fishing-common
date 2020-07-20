package com.specstory.common.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name = "goods_attribute") // 매핑할 테이블 정보 명시
public class GoodsAttributeEntity extends BaseEntity {
    @EmbeddedId
    private GoodsAttributeIdEntity goodsAttributeId;

    @Column(name = "attr_value")
    private String attrValue;

    @MapsId("goodsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id", columnDefinition = "CHAR(8)")
    private GoodsEntity goodsEntity;

    @MapsId("attrTemplateId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attr_template_id")
    private GoodsAttributeTemplateEntity goodsAttributeTemplateEntity;
}
