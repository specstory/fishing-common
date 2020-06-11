package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class GoodsFishKindIdEntity implements Serializable {
    @Column(columnDefinition = "CHAR(8)", nullable = false)
    private String goodsId;

    @Column(columnDefinition = "CHAR(4)", nullable = false)
    private String fishId;
}
