package com.MJR.bean.factory.support;

import com.MJR.bean.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mjr
 * @version 1.0
 * @description: 单例Bean注册器
 * @date 2023/3/15 1:00
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String,Object> singletonObjects = new HashMap<String,Object>();

    protected void registeSingle(String beanName, Object singletonObject) {
        singletonObjects.put(beanName,singletonObject);
    }

    @Override
    public Object getSingle(String beanName) {
        return singletonObjects.get(beanName);
    }
}
