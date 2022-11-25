package cn.wy.springframework.test.bean;

import cn.wy.springframework.beans.factory.support.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;


public class ProxyBeanFactory implements FactoryBean<IUserDao> {

    @Override
    public cn.wy.springframework.test.bean.IUserDao getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {

            // 添加排除方法
            if ("toString".equals(method.getName())) return this.toString();
            
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("10001", "aaa");
            hashMap.put("10002", "bbb");
            hashMap.put("10003", "ccc");
            
            return "你被代理了 " + method.getName() + "：" + hashMap.get(args[0].toString());
        };
        return (cn.wy.springframework.test.bean.IUserDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cn.wy.springframework.test.bean.IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return cn.wy.springframework.test.bean.IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
