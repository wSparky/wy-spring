package com.wy.springframework.beans.factory.support;

import com.wy.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  20:27
 * @Version: 1.0.0
 * @Description: TODO
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> stringObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return stringObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject){
        stringObjects.put(beanName,singletonObject);
    }
}
