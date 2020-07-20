package com.specstory.common.model.entity;

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
public class ComparisionCartIdEntity implements Serializable {
    @Column(columnDefinition = "회원아이디", nullable = false, length = 20)
    private String userId;

    //상품아이디
    @Column(columnDefinition = "CHAR(8)", nullable = false)
    private String goodsId;
}
