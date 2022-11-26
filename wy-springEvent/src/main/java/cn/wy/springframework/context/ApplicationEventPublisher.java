package cn.wy.springframework.context;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  19:10
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

}
