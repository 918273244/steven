package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 启动类
 * Created by Steven on 2017/4/12.
 */
@SpringBootApplication
public class App {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    public template void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
