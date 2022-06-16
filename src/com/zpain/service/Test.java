package com.zpain.service;

import com.zpain.spring.ZpainApplicationContext;

/**
 * @author zhangjun
 * @date 2022-06-15  16:09
 */
public class Test {

    public static void main(String[] args) {
        ZpainApplicationContext applicationContext = new ZpainApplicationContext(AppConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
