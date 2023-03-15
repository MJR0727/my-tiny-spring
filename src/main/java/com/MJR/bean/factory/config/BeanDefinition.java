package com.MJR.bean.factory.config;

/**
 * @author Mjr
 * @version 1.0
 * @description: 定义Bean实例的信息类 类型、配置参数等等。简化为只有类信息
 * @date 2023/3/15 1:03
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class clazz){
        this.beanClass = clazz;
    }

    public Class getBeanClass(){
        return this.beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

}
