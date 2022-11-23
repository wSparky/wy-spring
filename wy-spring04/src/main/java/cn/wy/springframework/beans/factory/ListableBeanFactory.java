package cn.wy.springframework.beans.factory;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.BeanFactory;

import java.util.Map;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-15  20:39
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
