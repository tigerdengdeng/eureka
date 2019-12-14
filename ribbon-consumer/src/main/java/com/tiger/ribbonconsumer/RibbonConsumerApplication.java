package com.tiger.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现； 
 * @EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
 * @EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到该服务。
 * @EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
 * 如果你的classpath中添加了eureka，则它们的作用是一样的。
 */
@EnableDiscoveryClient
@SpringBootApplication
//需要开启feign，告诉springboot 我整合了feign
@EnableFeignClients
public class RibbonConsumerApplication {
//	/**
//	 * Bean注解是将指定的东西 注入到IOC容器 方便全局注入
//	 * @return
//	 */
//	@Bean
//
//	/**
//	 * LoadBalanced负载均衡注解
//	 */
//	@LoadBalanced
//	/**
//	 * RestTemplate 是spring提供的一个远程调用服务类   http
//	 */
//	RestTemplate restTemplate(){
//		return  new RestTemplate();
//	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}

}
