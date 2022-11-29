package cn.wy.springframework.aop;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-28  20:00
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
