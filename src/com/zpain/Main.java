package com.zpain;

import com.zpain.service.UserService;
import com.zpain.spring.Component;

/**
 * @author zpzhang
 */
public class Main {

    public static void main(String[] args) {
        Class<Component> componentClass = Component.class;
        boolean annotation = componentClass.isAnnotation();
        System.out.println(annotation);

        Class<UserService> userServiceClass = UserService.class;
        System.out.println(userServiceClass.isAnnotation());
    }
}
