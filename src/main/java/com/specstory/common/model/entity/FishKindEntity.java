package com.specstory.common.model.entity;

import com.specstory.common.util.StringPrefixedSequenceIdGenerator;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "fish_kind")
public class FishKindEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fish_id")
    @GenericGenerator(
            name = "fish_id",
            strategy = "com.specstory.common.util.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "F"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
    @Column(name = "fish_id", columnDefinition="CHAR(4)", unique = true, nullable = false)
    private String fishId;

    @Column(nullable = false)
    private String fishName;

    @Column
    private int level;

    @Column
    private int orderNo;
}
