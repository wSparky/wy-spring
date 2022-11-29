package cn.wy.springframework.aop;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-29  19:22
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface PointcutAdvisor extends Advisor{

    Pointcut getPointcut();
}
