package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class GoodsFishKindIdEntity implements Serializable {
    @Column(name = "goodsId", columnDefinition = "CHAR(8)", nullable = false)
    private String goodsId;

    @Column(name = "fish_id", columnDefinition = "CHAR(4)", nullable = false)
    private String fishId;
}
