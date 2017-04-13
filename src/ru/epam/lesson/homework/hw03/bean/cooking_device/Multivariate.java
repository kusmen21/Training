package ru.epam.lesson.homework.hw03.bean.cooking_device.oven.multivariate;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.oven.Oven;

public class Multivariate extends Oven
{
	// количество встроенных программ
	protected int programCount;
	
	public Multivariate(String model, int power, Brand brand, int maxFoodWeight, int programCount) {
		super(model, power, brand, maxFoodWeight);
		this.programCount = programCount;
	}
	
	public void cookVegetables(){
		System.out.println("Cooking Vegetables in Multivariate Oven");
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
		return "Multivariate [maxFoodWeight=" + maxFoodWeight + ", model=" + model + ", power=" + power + ", brand="
				+ brand + ", programCount=" + programCount + "]";
	}
}
