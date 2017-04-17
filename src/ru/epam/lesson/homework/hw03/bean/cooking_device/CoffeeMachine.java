package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class CoffeeMachine extends CoffeeMaker
{	
	private boolean automatic;

	public CoffeeMachine(String model, int power, Brand brand, int maxFoodWeight, int pressure, boolean automatic) {
		super(model, power, brand, maxFoodWeight, pressure);
		this.automatic = automatic;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (automatic ? 1231 : 1237);
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
		CoffeeMachine other = (CoffeeMachine) obj;
		if (automatic != other.automatic)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CoffeeMachine [automatic=" + automatic + ", Pressure=" + getPressure() + ", MaxFoodWeight="
				+ getMaxFoodWeight() + ", Power=" + getPower() + ", Brand=" + getBrand() + ", Model="
				+ getModel() + ", On=" + isOn() + "]";
	}

	
	
}
