package com.adnstyle.hosb.domain.dto;

import com.adnstyle.hosb.domain.entity.NewsletterUser;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NewsletterUserDto {

    /*
    * 이름
    * */
    private String name;

    /*
    * 신청 회사
    * */
    private String company;

    /*
    * 이메일
    * */
    private String email;

    /*
    * 날짜
    * */
    private LocalDateTime applicationDate;

    @Builder
    public NewsletterUserDto(String name, String company, String email, LocalDateTime applicationDate) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.applicationDate = applicationDate;
    }

    public NewsletterUser toEntity() {
        return NewsletterUser.builder()
                .name(name)
                .email(email)
                .company(company)
                .applicationDate(applicationDate)
                .build();
    }
}
