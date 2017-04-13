package ru.epam.lesson.homework.hw03.bean.cooking_device.oven;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.CookingDevice;

public class Oven extends CookingDevice
{
	protected int maxFoodWeight;
	
	public Oven(String model, int power, Brand brand, int maxFoodWeight) {
		super(model, power, brand);
		this.maxFoodWeight = maxFoodWeight;
	}	
	
	@Override
	public void cook() {
		System.out.println("Cooking in Oven");
	}
	
	public void bake()
	{
		System.out.println("Baking in Oven");
	}

	public int getMaxFoodWeight() {
		return maxFoodWeight;
	}

	public void setMaxFoodWeight(int maxFoodWeight) {
		this.maxFoodWeight = maxFoodWeight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxFoodWeight;
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
		if (maxFoodWeight != other.maxFoodWeight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Oven [model=" + model + ", power=" + power + ", brand=" + brand + ", maxFoodWeight=" + maxFoodWeight
				+ "]";
	}
	
}
