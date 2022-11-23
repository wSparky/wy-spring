package cn.wy.springframework.context;

import cn.wy.springframework.beans.BeansException;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-21  19:59
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    void refresh() throws BeansException;

}
