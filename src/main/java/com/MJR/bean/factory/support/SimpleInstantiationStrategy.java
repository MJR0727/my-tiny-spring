package com.MJR.bean.factory.support;

import com.MJR.bean.factory.BeanException;
import com.MJR.bean.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author Mjr
 * @version 1.0
 * @description: 根据实例化类
 * @date 2023/3/16 0:57
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeanException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            //getDeclaredConstructor:根据形参获取目标类的指定public/protected构造器
            Constructor constructor = beanClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new BeanException("Error to instantiate Bean["+beanClass.getName()+"]",e);
        }
    }
}
