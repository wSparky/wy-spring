package com.wy.springframe.test01;


import com.wy.springframe.bean.UserService;
import org.junit.Test;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-03  20:09
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ApiTest {
    @Test
    public void test_BeamFactory(){
        //1.初始化BeanFactory
        BeanFactoryTest beanFactory = new BeanFactoryTest();

        //2.注册bean
        BeanDefinition1 beanDefinition = new BeanDefinition1(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3.获取
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
