package cn.wy.springframework.context.support;

import cn.wy.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.wy.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-22  19:34
 * @Version: 1.0.0
 * @Description: TODO
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory,this);
        String[] configLocations = getConfigLocations();
        if(null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }

    }

    protected abstract String[] getConfigLocations();
}
