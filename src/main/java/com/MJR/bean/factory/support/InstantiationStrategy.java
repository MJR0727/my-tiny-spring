package com.MJR.bean.factory.support;

import com.MJR.bean.factory.BeanException;
import com.MJR.bean.factory.config.BeanDefinition;

/**
 * @description:    Bean实例化策略接口
 * @author Mjr
 * @date 2023/3/16 0:55
 * @version 1.0
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeanException;
}
