package com.specstory.common.model.entity;

import com.specstory.common.util.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * AuthenticationTemplateEntity
 */
@Getter
@Setter
@Entity
@Table(name = "authentication_template")
public class AuthenticationTemplateEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "template_id")
    @GenericGenerator(
            name = "template_id",
            strategy = "com.specstory.common.util.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "T"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })

    @Column(name = "template_id", columnDefinition="CHAR(4)", unique = true, nullable = false, length = 4)
    private String templateId;

    @Column(name = "template_name")
    private String templateName;

    @Column(columnDefinition="CHAR(5)", name = "authentication_type")
    private String authenticationType;

    @Column(columnDefinition="CHAR(5)", name = "authentication_no_type")
    private String authenticationNoType;

    @Column(columnDefinition="CHAR(5)", name = "service_type")
    private String serviceType;

    @Column(name = "effective_time")
    private Integer effectiveTime;

    @Column(name = "template_message")
    private String templateMessage;

    @OneToMany(mappedBy = "authenticationTemplateEntity", fetch = FetchType.LAZY)
    private Set<AuthenticationEntity> authenticationEntities = new HashSet<>();
}
