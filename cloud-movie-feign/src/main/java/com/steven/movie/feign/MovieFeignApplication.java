package com.steven.movie.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 开启feign webservice
 * Created by Steven on 2017/5/5.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieFeignApplication.class,args);
    }
}
