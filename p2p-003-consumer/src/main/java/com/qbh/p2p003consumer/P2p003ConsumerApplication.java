package com.qbh.p2p003consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.qbh.p2p.service.loan.LoanService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class P2p003ConsumerApplication {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(P2p003ConsumerApplication.class, args);

    }

}
