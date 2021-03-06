package com.calc.CalculatorApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    double value1;
    double value2;

    public Calculator(@Value("${calc.value1}") double value1,@Value("${calc.value2}") double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    public double addition(){
        return value1+value2;
    }
    public double subtraction(){
        return value1-value2;
    }
    public double multiplication(){
        return value1*value2;
    }
    public double division(){
        return value1/value2;
    }
}
