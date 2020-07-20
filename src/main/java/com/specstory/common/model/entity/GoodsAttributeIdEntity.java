package com.specstory.common.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The type Goods attribute id entity.
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class GoodsAttributeIdEntity implements Serializable {
    @Column(name = "goods_id", columnDefinition = "CHAR(8)", nullable = false, length = 8)
    private String goodsId;

    @Column(nullable = false)
    private Integer attrTemplateId;
}
