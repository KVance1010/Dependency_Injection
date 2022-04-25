package com.studyeasy.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.studyeasy.cars.Corolla;
import com.studyeasy.cars.Mustang;
import com.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		Car ford = (Car) new Mustang();
		Car corolla = (Car) new Corolla();

		//System.out.println(ford.specs());
		//System.out.println(corolla.specs());
		
		//Car myCar = (Car) new Mustang();
		//System.out.println(myCar.specs());
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		Car myCar = context.getBean("mustang", Car.class);
		System.out.println(myCar.specs());
		System.out.println(ford + " " + corolla);
		context.close();

	}

}
