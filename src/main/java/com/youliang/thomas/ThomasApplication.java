package com.youliang.thomas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = "com.youliang.thomas.service")
public class ThomasApplication {

    public static void main(String[] args) {
        log.info("11111");
        SpringApplication.run(ThomasApplication.class, args);
        log.info("22222");
    }

}

