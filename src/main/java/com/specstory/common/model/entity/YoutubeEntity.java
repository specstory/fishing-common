package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "youtube")
public class YoutubeEntity {
    @EmbeddedId
    private YoutubeIdEntity youtubeId;

    @Column
    private String url;

    @Column(insertable = false, columnDefinition = "사용여부", length = 1)
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
    @JoinColumn(name="goods_id")
    private GoodsEntity goodsEntity;
}
