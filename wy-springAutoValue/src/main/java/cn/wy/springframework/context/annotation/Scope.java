package cn.wy.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-30  16:04
 * @Version: 1.0.0
 * @Description: TODO
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
