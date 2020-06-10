package com.specstory.common.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "review_image")
public class ReviewImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer imageId;

    @Column
    private String imageType;

    @Column
    private String fileName;

    @Column
    private String description;

    @Column
    private String url;

    @Column
    private Integer orderNo;

    @Column
    private String useYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="review_id")
    private ReviewEntity reviewEntity;
}
