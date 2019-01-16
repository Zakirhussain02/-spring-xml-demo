package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    private ApplicationContextAware context=null;
    public void setActor(Actor actor) {
        this.actor = actor;
    }


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Actor actor = (Actor) beanFactory.getBean("actor1");
        System.out.println(actor);
    }

    public void setBeanName(String s) {
        System.out.println("Bean names are: "+s);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Actor actor = (Actor) applicationContext.getBean("actor1");
        System.out.println("the actors "+actor);
    }
}
