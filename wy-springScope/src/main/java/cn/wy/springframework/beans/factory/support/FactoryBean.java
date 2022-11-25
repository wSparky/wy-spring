package cn.wy.springframework.beans.factory.support;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-25  21:01
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}
