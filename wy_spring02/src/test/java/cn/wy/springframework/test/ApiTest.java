package cn.wy.springframework.test;

import cn.wy.springframework.beans.factory.config.BeanDefinition;
import cn.wy.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.wy.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-10  19:47
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ApiTest {

   @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService","wy");
        userService.queryUserInfo();


    }
}
