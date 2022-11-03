package com.wy.springframe.test02;

import com.wy.springframe.bean.UserService;
import com.wy.springframework.beans.factory.config.BeanDefinition;
import com.wy.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  20:51
 * @Version: 1.0.0
 * @Description: TODO
 */

public class ApiTest02 {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
