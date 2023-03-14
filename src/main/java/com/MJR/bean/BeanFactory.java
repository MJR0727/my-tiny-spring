package com.MJR.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mjr
 * @version 1.0
 * @description: Bean工厂
 * @date 2023/3/10 11:39
 */
public class BeanFactory {

    Map<String,Object> beanMap = new HashMap<String,Object>();

    public BeanFactory() {
    }

    public void registerBean(String beanName,Object bean){
        beanMap.put(beanName,bean);
    }

    public Object getBean(String beanName){
        return beanMap.get(beanName);
    }


}
