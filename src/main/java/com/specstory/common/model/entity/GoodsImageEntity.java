package com.specstory.common.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * GoodsImageEntity
 */
@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name = "goods_image") // 매핑할 테이블 정보 명시
public class GoodsImageEntity extends BaseEntity {

    @Id // 기본키 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id", unique = true, nullable = false)
    private Integer imageId;

    @Column(name = "image_type", columnDefinition = "CHAR(5)")
    private String imageType;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "order_no")
    private int orderNo;

    @Column(name = "main_image_yn", columnDefinition = "CHAR(1)")
    private String mainImageYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id", columnDefinition = "CHAR(8)")
    private GoodsEntity goodsEntity;
}
