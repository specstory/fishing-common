package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class GoodsFishKindIdEntity implements Serializable {
    @Column(nullable = false, columnDefinition = "상품아이디", length = 8)
    private String goodsId;

    @Column(nullable = false, columnDefinition = "어종아이디", length = 4)
    private String fishId;
}
