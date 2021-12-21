package com.task1.BeansFactoryApplication;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
public class Beans1 {
    private int countOfBeans;
    private String beansName;
    Beans1(){}

    public Beans1(int countOfBeans, String beansName) {
        this.countOfBeans = countOfBeans;
        this.beansName = beansName;
    }

    public int getCountOfBeans() {
        return countOfBeans;
    }

    public void setCountOfBeans(int countOfBeans) {
        this.countOfBeans = countOfBeans;
    }

    public String getBeansName() {
        return beansName;
    }

    public void setBeansName(String beansName) {
        this.beansName = beansName;
    }
    public void show(){
        System.out.println("Count: "+ countOfBeans);
        System.out.println("Count: "+ beansName);
    }
}
