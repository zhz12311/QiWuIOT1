package com.keenyoda.shiyan.iot.eureakservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureakServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureakServiceApplication.class, args);
    }

}

