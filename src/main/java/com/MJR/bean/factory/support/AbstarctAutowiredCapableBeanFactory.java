package com.MJR.bean.factory.support;

import com.MJR.bean.factory.BeanException;
import com.MJR.bean.factory.config.BeanDefinition;

/**
 * @author Mjr
 * @version 1.0
 * @description: 自动注入配置Bean工厂类
 * @date 2023/3/15 1:31
 */
public abstract class AbstarctAutowiredCapableBeanFactory extends AbstarctBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        return doCreateBean(beanName,beanDefinition);
    }

    private Object doCreateBean(String beanName, BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try{
            bean = beanClass.newInstance();
        }catch (Exception e){
            throw new BeanException("Instantiation of bean failed",e);
        }
        registeSingle(beanName,bean);
        return bean;
    }
}
