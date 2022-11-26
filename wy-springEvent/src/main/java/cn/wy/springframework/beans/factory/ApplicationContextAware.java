package cn.wy.springframework.beans.factory;

import cn.wy.springframework.beans.BeansException;
import cn.wy.springframework.context.ApplicationContext;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-25  19:20
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ApplicationContextAware extends Aware{

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
