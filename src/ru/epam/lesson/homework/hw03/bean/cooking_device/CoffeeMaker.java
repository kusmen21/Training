package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class CoffeeMaker extends CookingDevice
{	
	private int pressure;
	
	public CoffeeMaker(String model, int power, Brand brand, int maxFoodWeight, int pressure) {
		super(model, power, brand, maxFoodWeight);
		this.pressure = pressure;
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
		return "CoffeeMaker [pressure=" + pressure + ", MaxFoodWeight=" + getMaxFoodWeight() + ", Power="
				+ getPower() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", On=" + isOn() + "]";
	}

	
	
}
