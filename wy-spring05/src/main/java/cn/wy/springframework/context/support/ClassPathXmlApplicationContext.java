package cn.wy.springframework.context.support;

import cn.wy.springframework.beans.BeansException;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-22  19:50
 * @Version: 1.0.0
 * @Description: TODO
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    public ClassPathXmlApplicationContext(){

    }
    //从Xml中加载BeanDefinition，并刷新上下文

    public ClassPathXmlApplicationContext(String configLocations) throws BeansException{
        this(new String[]{configLocations});
    }

    //从Xml中加载BeanDefinition，并刷新上下文
    public ClassPathXmlApplicationContext(String[] configLocations)throws BeansException{

        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
