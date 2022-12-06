package cn.wy.springframework.context.event;

import cn.wy.springframework.context.ApplicationContext;
import cn.wy.springframework.context.ApplicationEvent;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  18:37
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source){
        super(source);
    }

    public final ApplicationContext getApplicationContext(){
        return (ApplicationContext) getSource();
    }

}
