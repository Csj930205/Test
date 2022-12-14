package com.adnstyle.hosb.controller;

import com.adnstyle.hosb.domain.dto.NewsletterUserDto;
import com.adnstyle.hosb.domain.entity.NewsletterUser;
import com.adnstyle.hosb.service.NewsletterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NewsletterUserController {
    private final NewsletterUserService newsletterUserService;

    /**
    * 뉴스레터 등록
    * @param newsletterUserDto
    * @return
    * */
    @PostMapping("/newsletter/insert")
    public Map<String, Object> newsletterInsert(@RequestBody NewsletterUserDto newsletterUserDto) {
        NewsletterUser newsletterInsert = newsletterUserService.newsletterInsert(newsletterUserDto);

        Map<String, Object> result = new HashMap<>();

        if (newsletterInsert != null) {
            result.put("success", newsletterInsert);
            return result;
        } else {
            result.put("fail", null);
            return result;
        }

    }
}
