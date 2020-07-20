package com.specstory.common.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * ReviewImageEntity
 */
@Getter
@Setter
@Entity
@Table(name = "review_image")
public class ReviewImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id", unique = true, nullable = false)
    private Integer imageId;

    @Column(name = "image_type", columnDefinition = "CHAR(5)")
    private String imageType;

    @Column
    private String fileName;

    @Column
    private String description;

    @Column
    private String url;

    @Column
    private int orderNo;

    @Column(name = "use_yn", columnDefinition = "CHAR(1)", insertable = false)
    private String useYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="review_id")
    private ReviewEntity reviewEntity;
}
