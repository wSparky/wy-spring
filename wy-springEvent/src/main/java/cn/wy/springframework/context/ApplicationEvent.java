package cn.wy.springframework.context;

import java.util.EventObject;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-26  18:34
 * @Version: 1.0.0
 * @Description: TODO
 */
public abstract class ApplicationEvent extends EventObject {

    public ApplicationEvent(Object source){
        super((source));
    }

}
