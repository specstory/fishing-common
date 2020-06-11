package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity //클래스와 테이블 매핑
@Table(name="comparision_cart") // 매핑할 테이블 정보 명시
public class ComparisionCartEntity {
    @EmbeddedId
    private ComparisionCartIdEntity comparisionCartId;

    @Column(name = "use_yn", columnDefinition = "CHAR(1)", insertable = false)
    private String useYn;

    @Column(name = "registration_datetime", columnDefinition = "등록일시", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registrationDatetime;

    @MapsId("goodsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id", columnDefinition = "CHAR(8)")
    private GoodsEntity goodsEntity;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private UserEntity userEntity;
}
