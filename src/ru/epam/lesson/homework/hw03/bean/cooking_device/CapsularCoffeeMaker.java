package ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.capsular_coffee_maker;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.CoffeeMaker;

public class CapsularCoffeeMaker extends CoffeeMaker
{
	public CapsularCoffeeMaker(String model, int power, Brand brand, int pressure) {
		super(model, power, brand, pressure);		
	}
	
	public void doAmericano() 
	{		
		System.out.println("Doing Americano on Capsular Coffee Maker");
	}	
	
	@Override	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "CapsularCoffeeMaker [model=" + model + ", power=" + power + ", brand=" + brand + ", pressure="
				+ pressure + "]";
	}
	
	
}
