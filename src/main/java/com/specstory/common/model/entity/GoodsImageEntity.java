package com.specstory.common.model.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import lombok.Data;


@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "main_image_yn")
    private String mainImageYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="goods_id")
    private GoodsEntity goodsEntity;
}
