package com.hvary.warframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hvary.warframe.mapper")
public class WarframeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarframeApplication.class, args);
    }
}
