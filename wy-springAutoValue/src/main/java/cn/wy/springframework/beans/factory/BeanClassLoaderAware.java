package cn.wy.springframework.beans.factory;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-25  19:19
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}
