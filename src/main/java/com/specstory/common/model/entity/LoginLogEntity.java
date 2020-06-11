package com.specstory.common.model.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //클래스와 테이블 매핑
@Table(name="login_log") // 매핑할 테이블 정보 명시
public class LoginLogEntity {
    @Id // 기본키 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_Id", unique = true, nullable = false)
    private Integer logId;

    @Column(name = "user_Id")
    private String userId;

    @Column(name = "login_Fail_Yn", columnDefinition = "CHAR(1)")
    private String loginFailYn;

    @Column(name = "login_Datetime")
    private LocalDateTime loginDatetime;
}
