package cn.wy.springframework.beans.factory;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.wy.springframework.beans.factory.config.BeanDefinition;
import cn.wy.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-15  20:34
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
