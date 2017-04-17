package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class Multivariate extends Oven
{
	private int programCount;
	
	public Multivariate(String model, int power, Brand brand, int maxFoodWeight, int maxTemperature, int programCount) {
		super(model, power, brand, maxFoodWeight, maxTemperature);
		this.programCount = programCount;
	}	
	
	public int getProgramCount() {
		return programCount;
	}

	public void setProgramCount(int programCount) {
		this.programCount = programCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + programCount;
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
		Multivariate other = (Multivariate) obj;
		if (programCount != other.programCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Multivariate [programCount=" + programCount + ", MaxTemperature=" + getMaxTemperature()
				+ ", MaxFoodWeight=" + getMaxFoodWeight() + ", Power=" + getPower() + ", Brand="
				+ getBrand() + ", Model=" + getModel() + ", On=" + isOn() + "]";
	}

	
}
