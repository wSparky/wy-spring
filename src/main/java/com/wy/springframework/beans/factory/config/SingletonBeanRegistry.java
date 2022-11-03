package com.wy.springframework.beans.factory.config;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  20:26
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
