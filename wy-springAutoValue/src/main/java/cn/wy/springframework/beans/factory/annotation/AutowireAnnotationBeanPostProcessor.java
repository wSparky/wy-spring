package cn.wy.springframework.beans.factory.annotation;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ClassUtil;
import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.PropertyValues;
import cn.wy.springframework.beans.factory.BeanFactory;
import cn.wy.springframework.beans.factory.BeanFactoryAware;
import cn.wy.springframework.beans.factory.config.ConfigurableBeanFactory;
import cn.wy.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import cn.wy.springframework.utils.ClassUtils;

import java.lang.reflect.Field;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-12-05  20:43
 * @Version: 1.0.0
 * @Description: TODO
 */
public class AutowireAnnotationBeanPostProcessor implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {

    private ConfigurableBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (ConfigurableBeanFactory) beanFactory;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        //1.处理@Value注解
        Class<?> clazz = bean.getClass();
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() :clazz;

        Field[] declaredFields  = clazz.getDeclaredFields();
        for(Field field : declaredFields){
            Value valueAnnotation = field.getAnnotation(Value.class);
            if(null != valueAnnotation){
                String value = valueAnnotation.value();
                value = beanFactory.resolveEmbeddedValue(value);
                BeanUtil.setFieldValue(bean,field.getName(),value);
            }
        }


        //2.处理注解 @Autowired
        for(Field field : declaredFields){
            Autowired autowiredAnnotation = field.getAnnotation(Autowired.class);
            if(null != autowiredAnnotation){
                Class<?> fieldType = field.getType();
                String dependentBeanName = null;
                Qualifier qualifierAnnotation = field.getAnnotation(Qualifier.class);
                Object dependentBean = null;
                if(null != qualifierAnnotation){
                    dependentBeanName = qualifierAnnotation.value();
                    dependentBean = beanFactory.getBean(dependentBeanName, fieldType);
                } else {
                    dependentBean = beanFactory.getBean(fieldType);
                }
                BeanUtil.setFieldValue(bean, field.getName(), dependentBean);
            }
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }
}
