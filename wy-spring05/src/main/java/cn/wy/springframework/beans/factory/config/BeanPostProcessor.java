package cn.wy.springframework.beans.factory.config;

import cn.wy.springframework.beans.BeansException;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-21  19:48
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface BeanPostProcessor {

    //在Bean对象执行初始化之前执行
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    //在Bean对象执行初始化之后执行

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
