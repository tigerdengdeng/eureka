package com.tiger.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
//   注入远程服务接口调用类
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    /**
     * 这里是去调用别的微服务的接口 并接收服务返回
     */
    public  String helloConsumer(){
        return  restTemplate.getForEntity("http://eureka-client/hello",String
        .class).getBody();
    }
}
