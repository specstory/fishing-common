package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class WishListIdEntity implements Serializable {
    @Column(name = "user_id", nullable = false, length = 20)
    private String userId;

    @Column(name = "goods_id", columnDefinition = "CHAR(8)", nullable = false)
    private String goodsId;
}
