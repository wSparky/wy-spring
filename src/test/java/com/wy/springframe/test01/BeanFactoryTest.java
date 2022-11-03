package com.wy.springframe.test01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  20:02
 * @Version: 1.0.0
 * @Description: TODO
 */
public class BeanFactoryTest {

    Map<String, BeanDefinition1> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition1 beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }

}
