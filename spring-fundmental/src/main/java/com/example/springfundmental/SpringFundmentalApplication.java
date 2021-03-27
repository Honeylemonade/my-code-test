package com.example.springfundmental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringFundmentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFundmentalApplication.class, args);
    }

}
