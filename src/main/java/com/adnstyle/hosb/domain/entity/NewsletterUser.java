package com.adnstyle.hosb.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "newsletter_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsletterUser {

    /*
    * 식별자
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "newsletter_user_seq")
    private Long seq;

    /*
    * 이름
    * */
    @Column(name = "newsletter_user_name")
    private String name;

    /*
     * 회사 이름
     * */
    @Column(name = "newsletter_user_company")
    private String company;

    /*
    * 이메일
    * */
    @Column(name = "newsletter_user_email")
    private String email;

    /*
    * 날짜
    * */
    @Column(name = "newsletter_user_application_date")
    @CreatedDate
    private LocalDateTime applicationDate;

    @Builder
    public NewsletterUser(Long seq, String name, String company, String email, LocalDateTime applicationDate) {
        this.seq = seq;
        this.name = name;
        this.company = company;
        this.email = email;
        this.applicationDate = applicationDate;
    }


}
