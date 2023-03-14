package com.MJR.bean.factory.support;

import com.MJR.bean.factory.BeanException;
import com.MJR.bean.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mjr
 * @version 1.0
 * @description: 默认Bean工厂
 * @date 2023/3/15 1:44
 */
public class DefaultListeableBeanFactory extends AbstarctAutowiredCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<String,BeanDefinition>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if(beanDefinition==null){
            throw new BeanException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
