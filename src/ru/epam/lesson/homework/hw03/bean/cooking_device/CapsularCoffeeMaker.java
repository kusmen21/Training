package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class CapsularCoffeeMaker extends CoffeeMaker
{
	private int coffeeProgramCount;

	public CapsularCoffeeMaker(String model, int power, Brand brand, int maxFoodWeight, int pressure,
			int coffeeProgramCount) {
		super(model, power, brand, maxFoodWeight, pressure);
		this.coffeeProgramCount = coffeeProgramCount;
	}

	public int getCoffeeProgramCount() {
		return coffeeProgramCount;
	}

	public void setCoffeeProgramCount(int coffeeProgramCount) {
		this.coffeeProgramCount = coffeeProgramCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + coffeeProgramCount;
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
		CapsularCoffeeMaker other = (CapsularCoffeeMaker) obj;
		if (coffeeProgramCount != other.coffeeProgramCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CapsularCoffeeMaker [coffeeProgramCount=" + coffeeProgramCount + ", Pressure=" + getPressure()
				+ ", MaxFoodWeight=" + getMaxFoodWeight() + ", Power=" + getPower() + ", Brand="
				+ getBrand() + ", Model=" + getModel() + ", On=" + isOn() + "]";
	}
	
}
