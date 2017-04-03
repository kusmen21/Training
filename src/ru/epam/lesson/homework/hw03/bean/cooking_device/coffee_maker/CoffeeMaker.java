package ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.CookingDevice;

public class CoffeeMaker extends CookingDevice
{
	// давление пара для приготовления кофе
	protected int pressure;
	
	public CoffeeMaker(String model, int power, Brand brand, int pressure) {
		super(model, power, brand);
		this.pressure = pressure;
	}
	
	public void doEspresso()
	{			
		System.out.println("Doing espresso on Coffee Maker");		
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pressure;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeeMaker other = (CoffeeMaker) obj;
		if (pressure != other.pressure)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CoffeeMaker [model=" + model + ", power=" + power + ", brand=" + brand + ", pressure=" + pressure + "]";
	}

	
	
}
