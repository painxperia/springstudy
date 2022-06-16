package com.zpain.spring;

/**
 * @author zhangjun
 * @date 2022-06-16  13:31
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(String beanName, Object bean);

    Object postProcessAfterInitialization(String beanName, Object bean);
}
