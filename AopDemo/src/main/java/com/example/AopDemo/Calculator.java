package com.example.AopDemo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    int number1=16;
    int number2=0;
//
//    public Calculator() {
//    }
//
//    public Calculator(int number1, int number2) {
//        this.number1 = number1;
//        this.number2 = number2;
//    }

    public int add(){
        return number1+number2;
    }
    public int sub(){
        return number1-number2;
    }
    public void div(){
        try {
            int div = number1/number2;
            System.out.println("Division  " + div);
        }catch (ArithmeticException ae){
            System.out.println("Divide by zero Exceptionno ma'am" +
                    "");
        }
    }
    public int mul(){
        return number1*number2;
    }
    public void show(){
        System.out.println("Addition  " + add());
        System.out.println("Subtraction " + sub());
        div();
        System.out.println("Multiplication  " + mul());
    }
}
