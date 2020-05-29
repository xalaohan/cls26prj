package com.woniu.vueserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woniu.vueserver.mapper")
public class VueserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueserverApplication.class, args);
    }

}
