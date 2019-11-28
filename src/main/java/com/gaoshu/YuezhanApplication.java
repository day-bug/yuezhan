package com.gaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.gaoshu.mapper")
public class YuezhanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuezhanApplication.class, args);
    }

}
