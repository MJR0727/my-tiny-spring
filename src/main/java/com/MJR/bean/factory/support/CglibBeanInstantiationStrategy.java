package com.MJR.bean.factory.support;

import com.MJR.bean.factory.BeanException;
import com.MJR.bean.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Mjr
 * @version 1.0
 * @description: CGLIB动态生成子类实例Bean策略
 * @date 2023/3/16 1:17
 */
public class CglibBeanInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeanException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor)(obj,method,params,proxy)-> proxy.invokeSuper(obj,params));
        Object bean = enhancer.create();
        return bean;
    }

}
