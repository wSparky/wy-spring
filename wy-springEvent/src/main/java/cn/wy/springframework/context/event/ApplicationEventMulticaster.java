package cn.wy.springframework.context.event;

import cn.wy.springframework.context.ApplicationEvent;
import cn.wy.springframework.context.ApplicationListener;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  18:46
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
