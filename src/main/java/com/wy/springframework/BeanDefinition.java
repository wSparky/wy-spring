package com.wy.springframework;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  19:58
 * @Version: 1.0.0
 * @Description: TODO
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }
    public Object getBean(){
        return bean;
    }
}
