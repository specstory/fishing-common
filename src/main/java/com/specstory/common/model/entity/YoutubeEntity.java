package com.specstory.common.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * YoutubeEntity
 */
@Getter
@Setter
@Entity
@Table(name = "youtube")
public class YoutubeEntity {
    @EmbeddedId
    private YoutubeIdEntity youtubeId;

    @Column
    private String url;

    @Column(name = "use_yn", columnDefinition = "CHAR(1)", insertable = false)
    private String useYn;

    @Column(columnDefinition = "등록일시", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDatetime;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private UserEntity userEntity;

    @MapsId("goodsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id", columnDefinition = "CHAR(8)")
    private GoodsEntity goodsEntity;
}
