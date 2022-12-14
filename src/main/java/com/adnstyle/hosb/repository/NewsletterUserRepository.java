package com.adnstyle.hosb.repository;

import com.adnstyle.hosb.domain.entity.NewsletterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterUserRepository extends JpaRepository<NewsletterUser, Long> {
    NewsletterUser findByEmail(String email);
}
