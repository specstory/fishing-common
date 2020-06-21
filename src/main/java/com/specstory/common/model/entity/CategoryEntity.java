package com.specstory.common.model.entity;


import com.specstory.common.util.StringPrefixedSequenceIdGenerator;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity //클래스와 테이블 매핑
@Table(name="category") // 매핑할 테이블 정보 명시
public class CategoryEntity extends BaseEntity {

   @Id // 기본키 매핑
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
   @GenericGenerator(
           name = "category_seq",
           strategy = "com.specstory.common.util.StringPrefixedSequenceIdGenerator",
           parameters = {
                   @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                   @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "C"),
                   @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
   @Column(name = "category_id", columnDefinition="CHAR(4)", unique = true, nullable = false)
   private String categoryId;

   @Column(nullable = false)
   private String categoryName;

   @Column
   private int level;

   @Column
   private int orderNo;

   @Column
   private String url;

   @OneToMany(mappedBy = "categoryEntity", fetch = FetchType.LAZY)
   Set<GoodsCategoryEntity> goodsCategoryEntities = new HashSet<>();
}
