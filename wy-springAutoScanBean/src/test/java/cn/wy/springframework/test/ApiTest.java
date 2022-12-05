package cn.wy.springframework.test;


import cn.wy.springframework.aop.AdvisedSupport;
import cn.wy.springframework.aop.ClassFilter;
import cn.wy.springframework.aop.MethodMatcher;
import cn.wy.springframework.aop.TargetSource;
import cn.wy.springframework.aop.aspectj.AspectJExpressionPointcut;
import cn.wy.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import cn.wy.springframework.aop.framework.ProxyFactory;
import cn.wy.springframework.aop.framework.ReflectiveMethodInvocation;
import cn.wy.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.beans.factory.config.BeanPostProcessor;
import cn.wy.springframework.context.support.ClassPathXmlApplicationContext;
import cn.wy.springframework.test.bean.IUserService;
import cn.wy.springframework.test.bean.UserService;

import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Test
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService);
    }

    @Test
    public void test_beanPost(){

        BeanPostProcessor beanPostProcessor = new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }
        };

        List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.remove(beanPostProcessor);

        System.out.println(beanPostProcessors.size());
    }

}
