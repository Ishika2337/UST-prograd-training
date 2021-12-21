package com.calc.CalculatorApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//Create a simple spring boot application and add a class to implement calculator functionalities.
//Fetch the inputs required from application.properties file. use @component and @value annotations

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		double addition = calculator.addition();
		System.out.println("Addition of two number: " + addition);
		double subtraction = calculator.subtraction();
		System.out.println("subtraction of two number: " + subtraction);
		double multiplication = calculator.multiplication();
		System.out.println("multiplication of two number: " + multiplication);
		double division = calculator.division();
		System.out.println("division of two number: " + division);
	}

}
