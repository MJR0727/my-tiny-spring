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

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        return doCreateBean(beanName,beanDefinition);
    }

    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try{
            bean = instantiationBean(beanDefinition);
        }catch (Exception e){
            throw new BeanException("Instantiation of bean failed",e);
        }
        registeSingle(beanName,bean);
        return bean;
    }

    protected Object instantiationBean(BeanDefinition beanDefinition){
        return getInstantiationStrategy().instantiate(beanDefinition);
    }

    public InstantiationStrategy getInstantiationStrategy(){
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy){
        this.instantiationStrategy = instantiationStrategy;
    }
}
