package cn.wy.springframework.context.event;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  18:45
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

    public ContextRefreshedEvent(Object source){
        super(source);
    }
}
