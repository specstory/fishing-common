package com.specstory.common.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class GoodsCategoryIdEntity implements Serializable {
    @Column(name = "goods_id", columnDefinition = "CHAR(8)", nullable = false, length = 8)
    private String goodsId;

    @Column(name = "category_id", columnDefinition = "CHAR(4)", nullable = false, length = 4)
    private String categoryId;
}
