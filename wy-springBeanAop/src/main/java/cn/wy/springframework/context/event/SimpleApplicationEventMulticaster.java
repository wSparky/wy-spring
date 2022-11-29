package cn.wy.springframework.context.event;

import cn.wy.springframework.beans.factory.BeanFactory;
import cn.wy.springframework.context.ApplicationEvent;
import cn.wy.springframework.context.ApplicationListener;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  19:18
 * @Version: 1.0.0
 * @Description: TODO
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{
    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
