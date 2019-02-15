package com.keenyoda.shiyan.iot.prouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProUserApplication.class, args);
    }

}

