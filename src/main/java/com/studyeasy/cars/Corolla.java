package com.studyeasy.cars;

import org.springframework.stereotype.Component;

import com.studyeasy.interfaces.Car;

@Component("corolla")  // turns this into a spring bean
public class Corolla implements Car{

	@Override
	public String specs() {
		return "Maker is Toyota";
	}

}
