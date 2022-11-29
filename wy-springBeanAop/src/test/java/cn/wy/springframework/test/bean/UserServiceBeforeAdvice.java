package cn.wy.springframework.test.bean;

import cn.wy.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-29  19:58
 * @Version: 1.0.0
 * @Description: TODO
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}
