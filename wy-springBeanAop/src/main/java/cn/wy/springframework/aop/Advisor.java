package cn.wy.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-29  19:20
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface Advisor {

    Advice getAdvice();
}
