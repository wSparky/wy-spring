package cn.wy.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-29  19:17
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface MethodBeforeAdvice extends BeforeAdvice{

    void before(Method method, Object[] args, Object target) throws Throwable;
}
