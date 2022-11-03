package com.wy.springframe.test01;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  19:58
 * @Version: 1.0.0
 * @Description: TODO
 */
public class BeanDefinition1 {

    private Object bean;

    public BeanDefinition1(Object bean){
        this.bean = bean;
    }
    public Object getBean(){
        return bean;
    }
}
