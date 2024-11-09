package com.meenal.yumnum;

import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class YumNumApplication {

    public static void main(String[] args) {
        SpringApplication.run(YumNumApplication.class, args);
    }

}
