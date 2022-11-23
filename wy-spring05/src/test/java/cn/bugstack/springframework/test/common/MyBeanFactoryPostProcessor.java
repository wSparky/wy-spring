package cn.bugstack.springframework.test.common;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.PropertyValue;
import cn.wy.springframework.beans.PropertyValues;
import cn.wy.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.wy.springframework.beans.factory.config.BeanDefinition;
import cn.wy.springframework.beans.factory.config.BeanFactoryPostProcessor;

;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
