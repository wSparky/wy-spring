package cn.wy.springframework.beans.factory;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-23  19:29
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
