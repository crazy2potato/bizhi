package com.tudou.tudoupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.tudou.tudoupicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class TudouPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TudouPictureBackendApplication.class, args);
    }

}
