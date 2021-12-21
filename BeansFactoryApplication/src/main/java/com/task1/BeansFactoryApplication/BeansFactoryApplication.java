package com.task1.BeansFactoryApplication;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansFactoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeansFactoryApplication.class, args);
		int count = context.getBeanDefinitionCount();
		String[] name = context.getBeanDefinitionNames();
//		String[] beans = context.getBeanNamesForAnnotation(Component.class);
//		AutowireCapableBeanFactory beans1 = context.getAutowireCapableBeanFactory();
		System.out.println(count);
		for(String names: name){
			System.out.println(names);
		}
	}

}

