package cn.wy.springframework.test;

import cn.wy.springframework.beans.PropertyValue;
import cn.wy.springframework.beans.PropertyValues;
import cn.wy.springframework.beans.factory.config.BeanDefinition;
import cn.wy.springframework.beans.factory.config.BeanReference;
import cn.wy.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.wy.springframework.test.bean.UserDao;
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

        beanFactory.registerBeanDefinition("userDao",  new BeanDefinition(UserDao.class));

        // 3.UserService 设置属性 uId,userDao
       PropertyValues propertyValues = new PropertyValues();
       propertyValues.addPropertyValue(new PropertyValue("uId","10001"));
       propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4.UserService注入到bean
       BeanDefinition beanDefinition = new BeanDefinition(UserService.class,propertyValues);
       beanFactory.registerBeanDefinition("userService",beanDefinition);

       //5.UserService获取bean
       UserService userService = (UserService) beanFactory.getBean("userService");
       userService.queryUserInfo();
       System.out.println(userService.getUserDao().queryUserName("10002"));
    }
}
