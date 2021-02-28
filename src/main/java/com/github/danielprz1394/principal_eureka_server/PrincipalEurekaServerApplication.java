package com.github.danielprz1394.principal_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrincipalEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrincipalEurekaServerApplication.class, args);
    }
}

