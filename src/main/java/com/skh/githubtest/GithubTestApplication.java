package com.skh.githubtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class GithubTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubTestApplication.class, args);
        log.info("----------------项目初始化成功----------------");
    }
}
