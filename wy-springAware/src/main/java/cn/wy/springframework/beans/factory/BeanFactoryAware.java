package cn.wy.springframework.beans.factory;

import cn.wy.springframework.beans.BeansException;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-25  19:13
 * @Version: 1.0.0
 * @Description: 感知其所属的BeanFactory
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;


}
