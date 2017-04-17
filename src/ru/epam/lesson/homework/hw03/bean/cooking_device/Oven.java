package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class Oven extends CookingDevice
{
	private int maxTemperature;
	
	public Oven(String model, int power, Brand brand, int maxFoodWeight, int maxTemperature) {
		super(model, power, brand, maxFoodWeight);
		this.maxTemperature = maxTemperature;
	}

	public int getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxTemperature;
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
		Oven other = (Oven) obj;
		if (maxTemperature != other.maxTemperature)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Oven [maxTemperature=" + maxTemperature + ", MaxFoodWeight=" + getMaxFoodWeight() + ", Power="
				+ getPower() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", On=" + isOn() + "]";
	}	
	

	
}
