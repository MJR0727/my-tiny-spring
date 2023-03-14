package com.MJR.bean.factory.support;

import com.MJR.bean.factory.BeanFactory;
import com.MJR.bean.factory.config.BeanDefinition;


/**
 * @author Mjr
 * @version 1.0
 * @description: Bean工厂
 * @date 2023/3/10 11:39
 */
public abstract class AbstarctBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

    @Override
    public Object getBean(String beanName){
        Object singletonBean = getSingle(beanName);
        if(singletonBean!=null){
            return singletonBean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }


}
