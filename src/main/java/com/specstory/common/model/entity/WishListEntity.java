package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "wish_list")
public class WishListEntity {
    @EmbeddedId
    private WishListIdEntity wishListId;

    @Column(insertable = false, columnDefinition = "사용여부", length = 1)
    private String useYn;

    @Column(columnDefinition = "등록일시", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDatetime;
}
