package cn.wy.springframework.beans.factory;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-25  19:15
 * @Version: 1.0.0
 * @Description: 感知所属的BeanName
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);
}
