package cn.wy.springframework.context;

import cn.wy.springframework.beans.factory.HierarchicalBeanFactory;
import cn.wy.springframework.beans.factory.ListableBeanFactory;
import cn.wy.springframework.core.io.ResourceLoader;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-21  19:56
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
