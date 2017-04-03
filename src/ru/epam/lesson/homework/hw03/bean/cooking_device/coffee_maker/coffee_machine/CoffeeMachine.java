package ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.coffee_machine;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.CoffeeMaker;

public class CoffeeMachine extends CoffeeMaker
{	
	
	public CoffeeMachine(String model, int power, Brand brand, int pressure) {
		super(model, power, brand, pressure);		
	}

	public void doCappucino() 
	{		
		System.out.println("Doing Cappucino on Coffee Machine");
	}	
	
	public void doLatte() 
	{		
		System.out.println("Doing Latte on Coffee Machine");
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
		return "CoffeeMachine [model=" + model + ", power=" + power + ", brand=" + brand + ", pressure="
				+ pressure + "]";
	}
}
