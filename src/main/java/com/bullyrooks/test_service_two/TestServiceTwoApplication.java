package com.bullyrooks.test_service_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceTwoApplication.class, args);
    }

}
