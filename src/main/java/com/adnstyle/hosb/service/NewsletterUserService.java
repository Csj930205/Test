package com.adnstyle.hosb.service;

import com.adnstyle.hosb.domain.dto.NewsletterUserDto;
import com.adnstyle.hosb.domain.entity.NewsletterUser;
import com.adnstyle.hosb.repository.NewsletterUserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsletterUserService {
    private final NewsletterUserRepository newsletterUserRepository;

    /*
    * 신청자 조회(전체 조회)
    * */
    public List<NewsletterUser> newsletterAllList() {
        List<NewsletterUser> newsletterUsers = newsletterUserRepository.findAll();

        if (newsletterUsers.isEmpty()) {
            return null;
        } else {
            return newsletterUsers;
        }
    }

    /*
    * 신청자 등록
    * */
    @Transactional
    public NewsletterUser newsletterInsert(NewsletterUserDto newsletterUserDto) {
        NewsletterUser newsletterUserEmail = newsletterUserRepository.findByEmail(newsletterUserDto.getEmail());

        if (newsletterUserEmail == null) {
            return newsletterUserRepository.save(newsletterUserDto.toEntity());
        } else {
            return null;
        }
    }
}
