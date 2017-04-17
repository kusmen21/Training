package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class KitchenStove extends CookingDevice 
{
	private int burnerCount;
	
	public KitchenStove(String model, int power, Brand brand, int maxFoodWeight, int burnerCount) {
		super(model, power, brand, maxFoodWeight);
		this.burnerCount = burnerCount;
	}
	
	public int getBurnerCount() {
		return burnerCount;
	}

	public void setBurnerCount(int burnerCount) {
		this.burnerCount = burnerCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + burnerCount;
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
		KitchenStove other = (KitchenStove) obj;
		if (burnerCount != other.burnerCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KitchenStove [burnerCount=" + burnerCount + ", MaxFoodWeight=" + getMaxFoodWeight()
				+ ", Power=" + getPower() + ", Brand=" + getBrand() + ", Model=" + getModel()
				+ ", On=" + isOn() + "]";
	}

	
	
}
