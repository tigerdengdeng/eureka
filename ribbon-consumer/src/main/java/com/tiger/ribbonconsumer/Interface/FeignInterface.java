package com.tiger.ribbonconsumer.Interface;

import com.tiger.ribbonconsumer.Inrterfaceimpl.FegiInterfaceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign 接口
 */
//指定feign调用那个微服务  //fallback = FegiInterfaceImpl.class 如果发生错误 就去实现类里面 获取数据  断路器
@FeignClient(value = "eureka-client",fallback = FegiInterfaceImpl.class)
public interface FeignInterface {
   //指定控制器
    /**
     *  假如此服务发现了故障 ，熔断器（断路器） 重写此方法  为防止系统
     *     错误，从Redis读取上一次数据给它返回回去
     */
   @RequestMapping(value = "helloclient")
    public String helloConsumer();


}
