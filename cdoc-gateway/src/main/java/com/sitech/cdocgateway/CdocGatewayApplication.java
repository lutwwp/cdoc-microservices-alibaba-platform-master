package com.sitech.cdocgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CdocGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdocGatewayApplication.class, args);
    }

}
