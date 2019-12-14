package com.tiger.ribbonconsumer.Inrterfaceimpl;

import com.tiger.ribbonconsumer.Interface.FeignInterface;
import org.springframework.stereotype.Component;


/**
 * 断路器此实现方法为 若服务出现故障 重写故障服务 返回指定数据
 * 防止系统奔溃  可以通知系统运维和开发人员及时修复
 */
@Component
public class FegiInterfaceImpl implements FeignInterface {


    @Override
    public String helloConsumer() {
        return "发生错误了";
    }
}
