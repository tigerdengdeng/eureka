package com.tiger.ribbonconsumer.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign 接口
 */
//指定feign调用那个微服务
@FeignClient("eureka-client")
public interface FeignInterface {
   //指定控制器
   @RequestMapping(value = "helloclient")
    public String helloConsumer();


}
