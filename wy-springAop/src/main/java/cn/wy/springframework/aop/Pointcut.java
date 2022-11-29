package cn.wy.springframework.aop;


/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-28  19:57
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
