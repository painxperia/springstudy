package com.zpain.service;

import com.zpain.spring.BeanPostProcessor;
import com.zpain.spring.Component;
import com.zpain.spring.ZpainApplicationContext;

/**
 * @author zhangjun
 * @date 2022-06-16  13:32
 */
@Component
public class ZpainTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(String beanName, Object bean) {
//        System.out.println(beanName);
//        System.out.println(bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(String beanName, Object bean) {
//        if ("userService".equals(beanName)){
//            return new OrderService();
//        }
        return bean;
    }
}
