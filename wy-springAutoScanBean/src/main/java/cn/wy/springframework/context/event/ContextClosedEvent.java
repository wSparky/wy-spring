package cn.wy.springframework.context.event;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  18:42
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    public ContextClosedEvent(Object source){
        super(source);
    }
}
