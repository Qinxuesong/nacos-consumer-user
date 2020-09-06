package com.atguigu.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //开启扫描feign客户端的功能
@EnableDiscoveryClient //启用nacos客户端功能
@SpringBootApplication
public class NacosConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerUserApplication.class, args);
    }

}
