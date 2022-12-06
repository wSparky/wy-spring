package cn.wy.springframework.stereotype;

import javax.xml.bind.Element;
import java.lang.annotation.*;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-30  16:08
 * @Version: 1.0.0
 * @Description: TODO
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}
