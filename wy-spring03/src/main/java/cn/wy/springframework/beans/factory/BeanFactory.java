package cn.wy.springframework.beans.factory;

import cn.wy.springframework.beans.BeansException;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-10  19:42
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object...args) throws BeansException;
}
