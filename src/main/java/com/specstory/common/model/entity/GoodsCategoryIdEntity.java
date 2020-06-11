package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class GoodsCategoryIdEntity implements Serializable {
    //상품아이디
    @Column(columnDefinition = "CHAR(8)", nullable = false)
    private String goodsId;

    //카테고리아이디
    @Column(columnDefinition = "CHAR(4)", nullable = false)
    private String categoryId;
}
