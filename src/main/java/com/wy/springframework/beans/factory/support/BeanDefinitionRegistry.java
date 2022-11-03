package com.wy.springframework.beans.factory.support;

import com.wy.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  20:48
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface BeanDefinitionRegistry {


        /**
         * 向注册表中注册 BeanDefinition
         *
         * @param beanName
         * @param beanDefinition
         */
        void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


}
