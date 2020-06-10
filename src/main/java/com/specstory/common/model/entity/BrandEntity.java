package com.specstory.common.model.entity;


import com.specstory.common.util.StringPrefixedSequenceIdGenerator;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity //클래스와 테이블 매핑
@Table(name = "brand")
public class BrandEntity extends BaseEntity {

   @Id // 기본키 매핑
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_id")
   @GenericGenerator(
           name = "brand_id",
           strategy = "com.specstory.common.util.StringPrefixedSequenceIdGenerator",
           parameters = {
                   @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                   @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B"),
                   @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })

   @Column(nullable = false, columnDefinition = "브랜드아이디", length = 5)
   private String brandId;

   @Column(nullable = false, columnDefinition = "브랜드명", length = 50)
   private String brandName;

   @Column(columnDefinition = "순서")
   private long orderNo;
}
