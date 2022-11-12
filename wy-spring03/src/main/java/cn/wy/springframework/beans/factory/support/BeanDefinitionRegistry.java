package cn.wy.springframework.beans.factory.support;

import cn.wy.springframework.beans.factory.config.BeanDefinition;

/**
 *@author wangye
 *@Email  wangye.wy@outlook.com
 *@CreateTime: 2022-11-10  19:37
 *@Version: 1.0.0
 *@Description: TODO
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}