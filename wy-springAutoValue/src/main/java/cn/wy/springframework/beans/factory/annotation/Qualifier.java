package cn.wy.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-12-05  20:41
 * @Version: 1.0.0
 * @Description: TODO
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {
    String value() default "";
}
