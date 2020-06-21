package com.specstory.common.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "wish_list")
public class WishListEntity {
    @EmbeddedId
    private WishListIdEntity wishListId;

    @Column(name = "use_yn", columnDefinition = "CHAR(1)", insertable = false)
    private String useYn;

    @Column(name = "registration_datetime", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registrationDatetime;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private UserEntity userEntity;

    @MapsId("goodsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id", columnDefinition = "CHAR(8)")
    private GoodsEntity goodsEntity;
}
