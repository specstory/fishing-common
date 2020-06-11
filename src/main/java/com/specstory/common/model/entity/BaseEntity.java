package com.specstory.common.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Column(insertable = false, columnDefinition = "사용여부", length = 1)
    private String useYn;

    @Column(columnDefinition = "등록자", length = 20)
    private String registrantId;

    @Column(columnDefinition = "등록일시", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDatetime;

    @Column(columnDefinition = "수정자", length = 20)
    private String updateId;
p
    @Column(columnDefinition = "수정일시")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDatetime;
/*    @CreatedDate
    private LocalDateTime registrationDatetime;

    @LastModifiedDate
    private LocalDateTime updateDatetime;*/

}