package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class YoutubeIdEntity implements Serializable {
    @Column(nullable = false, columnDefinition = "회원아이디", length = 20)
    private String userId;

    @Column(nullable = false, columnDefinition = "상품아이디", length = 8)
    private String goodsId;
}
