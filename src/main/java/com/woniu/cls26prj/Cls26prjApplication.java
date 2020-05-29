package com.woniu.cls26prj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.woniu.cls26prj.mapper")
@ServletComponentScan("com.woniu.cls26prj.filter")
public class Cls26prjApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cls26prjApplication.class, args);
    }

}
