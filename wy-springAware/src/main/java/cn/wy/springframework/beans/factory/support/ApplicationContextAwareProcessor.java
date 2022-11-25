package cn.wy.springframework.beans.factory.support;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.ApplicationContextAware;
import cn.wy.springframework.beans.factory.config.BeanPostProcessor;
import cn.wy.springframework.context.ApplicationContext;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-25  19:21
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext){

        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
