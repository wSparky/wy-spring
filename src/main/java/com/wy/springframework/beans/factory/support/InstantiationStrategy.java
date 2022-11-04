package com.wy.springframework.beans.factory.support;

import com.wy.springframework.beans.BeansException;
import com.wy.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-04  20:20
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface InstantiationStrategy {
    Object instance(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
