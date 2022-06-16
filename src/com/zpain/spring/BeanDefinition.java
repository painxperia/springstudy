package com.zpain.spring;

/**
 * @author zhangjun
 * @date 2022-06-15  16:40
 */
public class BeanDefinition {

    private Class<?> type;

    private String scope;

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
