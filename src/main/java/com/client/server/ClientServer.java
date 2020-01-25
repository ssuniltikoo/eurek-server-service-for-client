package com.client.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ClientServer {

    public static void main(String... args) {
        SpringApplication.run(ClientServer.class, args);
    }

    @RequestMapping("/rest/hello/server")
    @GetMapping
    public String home() {
        return "Hello World";
    }
}
