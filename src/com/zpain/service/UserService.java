package com.zpain.service;

import com.zpain.spring.Autowired;
import com.zpain.spring.BeanNameAware;
import com.zpain.spring.Component;
import com.zpain.spring.InitializingBean;

/**
 * @author zhangjun
 * @date 2022-06-15  16:09
 */
@Component("userService")
//@Scope("prototype")
public class UserService implements BeanNameAware, InitializingBean {

    @Autowired
    private OrderService orderService;

    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println(beanName);
    }

    public void test() {
        System.out.println(orderService);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("userService被调用");
    }
}
