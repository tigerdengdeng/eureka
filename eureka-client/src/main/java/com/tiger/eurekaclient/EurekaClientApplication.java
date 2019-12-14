package com.tiger.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient  //启动类EurekaClientApplication.java添加@EnableDiscoveryClient注解以实现Eureka中的DiscoveryClient实现。
@SpringBootApplication
//需要开启feign，告诉springboot 我整合了feign
@EnableFeignClients
//熔断器
@EnableHystrix
/**
 * 创建并注册服务提供者 Eureka Client
 * @EnableEurekaClient和@EnableDiscoveryClient的区别
 * spring cloud中discovery service有许多种实现（eureka、consul、zookeeper等等），@EnableDiscoveryClient基于spring-cloud-commons,@EnableEurekaClient基于spring-cloud-netflix。
 *
 * 就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
