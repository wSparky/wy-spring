package cn.wy.springframework.aop.aspectj;

import cn.wy.springframework.aop.Advisor;
import cn.wy.springframework.aop.Pointcut;
import cn.wy.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-29  19:26
 * @Version: 1.0.0
 * @Description: TODO
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    //切面
    private AspectJExpressionPointcut pointcut;
    //具体拦截方法
    private Advice advice;
    //表达式
    private String expression;

    public void setExpression(String expression){
        this.expression = expression;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (null == pointcut) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    public void setAdvice(Advice advice){
        this.advice = advice;
    }

}
