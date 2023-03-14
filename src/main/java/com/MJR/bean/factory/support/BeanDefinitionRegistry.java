package com.MJR.bean.factory.support;

import com.MJR.bean.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName,BeanDefinition beanDefinition);
}
