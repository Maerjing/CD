package com.wang.cd.coupon;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wang.cd.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class CdCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(CdCouponApplication.class,args);
    }
}
