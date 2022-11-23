package cn.wy.springframework.beans.factory.support;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-10  20:02
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
