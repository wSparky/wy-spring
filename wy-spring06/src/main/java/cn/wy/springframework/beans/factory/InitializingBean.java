package cn.wy.springframework.beans.factory;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-23  19:28
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
