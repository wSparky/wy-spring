package cn.wy.springframework.beans.factory.config;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-21  19:44
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface BeanFactoryPostProcessor {

    /**
     *
     * @description: 加载完所有BeanDefinition，实例化Bean对象以前。提供修改BeanDefinition属性的机制
     * @param beanFactory

     */

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
