package com.studyeasy.cars;

import org.springframework.stereotype.Component;

import com.studyeasy.interfaces.Car;

@Component // ("mustang") this will use the default name of the class if not specified... all letters will be lowercase
public class Mustang implements Car {

	@Override
	public String specs() {
		return "Maker is Ford";
	}
	
	

}
