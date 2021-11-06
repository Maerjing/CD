package com.wang.cd.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.wang.cd.product.dao")
@EnableDiscoveryClient
public class CdProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(CdProductApplication.class, args);
    }
}
