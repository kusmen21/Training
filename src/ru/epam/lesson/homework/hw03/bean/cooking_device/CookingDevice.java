package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public abstract class CookingDevice extends ElectronicDevice
{
	private int maxFoodWeight;
	
	public CookingDevice(String model, int power, Brand brand, int maxFoodWeight) {
		super(model, power, brand);	
		this.maxFoodWeight = maxFoodWeight;
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
		CookingDevice other = (CookingDevice) obj;
		if (maxFoodWeight != other.maxFoodWeight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CookingDevice [maxFoodWeight=" + maxFoodWeight + ", Power=" + getPower() + ", Brand)="
				+ getBrand() + ", Model=" + getModel() + ", On=" + isOn() + "]";
	}

	
}
