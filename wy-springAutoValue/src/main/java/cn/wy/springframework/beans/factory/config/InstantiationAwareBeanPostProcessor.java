package cn.wy.springframework.beans.factory.config;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.PropertyValues;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-29  19:47
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;
}
