package cn.wy.springframework.context;

import java.util.EventListener;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  18:50
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
