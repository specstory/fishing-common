package com.specstory.common.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Column(name = "use_yn", insertable = false, columnDefinition="CHAR(1)")
    private String useYn;

    @Column(name = "registrant_id", columnDefinition = "등록자", length = 20)
    private String registrantId;

    @Column(name = "registration_datetime", columnDefinition = "등록일시", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registrationDatetime;

    @Column(name = "update_id", columnDefinition = "수정자", length = 20)
    private String updateId;

    @Column(name = "update_datetime", columnDefinition = "수정일시")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updateDatetime;
/*    @CreatedDate
    private LocalDateTime registrationDatetime;

    @LastModifiedDate
    private LocalDateTime updateDatetime;*/

}