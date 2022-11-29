package cn.wy.springframework.beans.factory.support;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-10  20:10
 * @Version: 1.0.0
 * @Description: TODO
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if(null == ctor)return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(),args);
    }
}
