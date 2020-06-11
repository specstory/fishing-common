package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "goods_fish_kind")
public class GoodsFishKindEntity extends BaseEntity {
    @EmbeddedId
    private GoodsFishKindIdEntity goodsFishKindId;

    /*
     @MapsId는 외래 키와 매핑한 연관관계를 기본 키에도 매핑하겠다는 뜻

     @OneToOne, @ManyToOne : EAGER
     @OneToMany, @ManyToMany : LAZY
     즉시 로딩이 필요하지 않은 @OneToOne, @ManyToOne 연관관계에 대해서는 글로벌 페치 전략을 LAZY로 변경해서 불필요한 쿼리 실행 방지
  */
    @MapsId("goodsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id", columnDefinition = "CHAR(8)")
    private GoodsEntity goodsEntity;

    @MapsId("fishId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fish_id", columnDefinition = "CHAR(4)")
    private FishKindEntity fishKindEntity;

}
