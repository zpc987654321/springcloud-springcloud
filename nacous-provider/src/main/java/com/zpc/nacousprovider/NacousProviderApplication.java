package com.zpc.nacousprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacousProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacousProviderApplication.class, args);
    }

}
