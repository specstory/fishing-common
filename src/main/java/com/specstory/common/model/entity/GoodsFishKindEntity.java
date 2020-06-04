package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "goods_fish_kind")
public class GoodsFishKindEntity {
    @EmbeddedId
    private GoodsFishKindIdEntity goodsFishKindId;

    @Column(insertable = false, columnDefinition = "사용여부", length = 1)
    private String useYn;

    @Column(columnDefinition = "등록자", length = 20)
    private String registrantId;

    @Column(columnDefinition = "등록일시", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDatetime;

    @Column(columnDefinition = "수정자", length = 20)
    private String updateId;

    @Column(columnDefinition = "수정일시")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDatetime;

    /*
     @MapsId는 외래 키와 매핑한 연관관계를 기본 키에도 매핑하겠다는 뜻

     @OneToOne, @ManyToOne : EAGER
     @OneToMany, @ManyToMany : LAZY
     즉시 로딩이 필요하지 않은 @OneToOne, @ManyToOne 연관관계에 대해서는 글로벌 페치 전략을 LAZY로 변경해서 불필요한 쿼리 실행 방지
  */
    @MapsId("goodsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id")
    private GoodsEntity goodsEntity;

 /*   
    사용할일이 없어서 일단 주석처리 필요시 주석제거
    @MapsId("fishId")
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="fish_id")
    private FishKindEntity fishKindEntity;*/

}
