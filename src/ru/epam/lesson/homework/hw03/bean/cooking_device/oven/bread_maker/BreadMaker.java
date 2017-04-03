package ru.epam.lesson.homework.hw03.bean.cooking_device.oven.bread_maker;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.oven.Oven;

public class BreadMaker extends Oven
{
	protected int maxTemperature;
	
	public BreadMaker(String model, int power, Brand brand, int maxFoodWeight, int maxTemperature) {
		super(model, power, brand, maxFoodWeight);
		this.maxTemperature = maxTemperature;
	}
	
	public void bakeBread()
	{
		System.out.println("Baking bread in Bread Maker");
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
		BreadMaker other = (BreadMaker) obj;
		if (maxTemperature != other.maxTemperature)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BreadMaker [maxFoodWeight=" + maxFoodWeight + ", model=" + model + ", power=" + power + ", brand="
				+ brand + ", maxTemperature=" + maxTemperature + "]";
	}
	
	
}
