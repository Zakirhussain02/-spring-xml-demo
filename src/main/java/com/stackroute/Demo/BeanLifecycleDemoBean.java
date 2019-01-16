package com.stackroute.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside InitializingBean");
    }

    public void destroy() throws Exception {
        System.out.println("Inside DisposableBean");
    }
    public void customInit() throws Exception{
        System.out.println("Inside CustomInit");
    }
    public void customDestroy() throws Exception{
        System.out.println("Inside CustomDestroy");
    }
}
