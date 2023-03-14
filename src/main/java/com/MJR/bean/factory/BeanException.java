package com.MJR.bean.factory;

/**
 * @author Mjr
 * @version 1.0
 * @description: Bean异常类
 * @date 2023/3/15 1:34
 */
public class BeanException extends RuntimeException{

    public BeanException(String exceptionMsg,Throwable e){
        super(exceptionMsg,e);
    }

    public BeanException(String exceptionMsg){
        super(exceptionMsg);
    }
}
