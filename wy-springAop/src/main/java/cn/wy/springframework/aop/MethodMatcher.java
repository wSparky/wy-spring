package cn.wy.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-28  20:01
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
