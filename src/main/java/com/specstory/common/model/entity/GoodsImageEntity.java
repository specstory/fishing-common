package com.specstory.common.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name = "goods_image") // 매핑할 테이블 정보 명시
public class GoodsImageEntity {

    @Id // 기본키 매핑
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "image_id", nullable = false)
    private long imageId;

    @Column(name = "goods_id", nullable = false)
    private String goodsId;

    @Column(name = "image_type")
    private String imageType;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "main_image_yn")
    private String mainImageYn;

    @Column(name = "use_yn")
    private String useYn;

    @Column(name = "registrant_id")
    private String registrantId;

    @Column(name = "update_datetime")
    private java.sql.Timestamp update_datetime;

    @Column(name = "update_id")
    private String update_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id", insertable = false, updatable = false)
    GoodsEntity goods;  // <=== ReadOnly 설정
}
