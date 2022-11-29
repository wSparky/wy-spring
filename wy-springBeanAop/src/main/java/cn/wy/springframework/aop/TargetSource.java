package cn.wy.springframework.aop;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-28  20:19
 * @Version: 1.0.0
 * @Description: TODO
 */
public class TargetSource {


    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }


    public Class<?>[] getTargetClass(){
        return this.target.getClass().getInterfaces();
    }


    public Object getTarget(){
        return this.target;
    }
}
