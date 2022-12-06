package cn.wy.springframework.beans.factory.config;

import cn.wy.springframework.beans.factory.HierarchicalBeanFactory;
import cn.wy.springframework.utils.StringValueResolver;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-15  20:30
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);
}