package com.wang.cd.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.wang.cd.member.dao")
@EnableDiscoveryClient
public class CdMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdMemberApplication.class, args);
    }

}
