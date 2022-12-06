package cn.wy.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-12-05  20:42
 * @Version: 1.0.0
 * @Description: TODO
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {
    String value();
}
