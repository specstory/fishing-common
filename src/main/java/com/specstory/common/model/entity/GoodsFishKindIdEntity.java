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
public class GoodsFishKindIdEntity implements Serializable {
    @Column(name = "goodsId", columnDefinition = "CHAR(8)", nullable = false)
    private String goodsId;

    @Column(name = "fish_id", columnDefinition = "CHAR(4)", nullable = false)
    private String fishId;
}
