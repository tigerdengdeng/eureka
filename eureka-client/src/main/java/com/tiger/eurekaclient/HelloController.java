package com.tiger.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    private  static  final Logger LOGGER=Logger.getLogger(String.valueOf(HelloController.class));
    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public  String index(){
        StringBuffer uriList=new StringBuffer("Hello word"+port+"端口为你服务");
        return  uriList.toString();

    }

}
