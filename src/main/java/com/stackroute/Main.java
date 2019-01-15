package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        //for actors
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //use id of actor here
        Actor actor = (Actor) beanFactory.getBean("actor1");
        System.out.println(actor);

        //for movie param
        Movie movie = (Movie) beanFactory.getBean("movie1");
        System.out.println(movie);

        //beandefination factory

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Actor actor1 = (Actor) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("actor1");
        System.out.println(actor1);

        //ApplicationContext

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie1);




    }
}
