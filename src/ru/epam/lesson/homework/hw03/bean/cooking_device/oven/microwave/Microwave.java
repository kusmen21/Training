package ru.epam.lesson.homework.hw03.bean.cooking_device.oven.microwave;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cooking_device.oven.Oven;

public class Microwave extends Oven
{	
	// мощность микроволн
	protected int microwavePower;
	
	public Microwave(String model, int power, Brand brand, int maxFoodWeight, int microwavePower) {
		super(model, power, brand, maxFoodWeight);
		this.microwavePower = microwavePower;
	}
	
	public void reheatFood()
	{
		System.out.println("Reheating food in Microvawe Oven");
	}

	public int getMicrovawePower() {
		return microwavePower;
	}

	public void setMicrovawePower(int microvawePower) {
		this.microwavePower = microvawePower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + microwavePower;
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
		Microwave other = (Microwave) obj;
		if (microwavePower != other.microwavePower)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Microwave [maxFoodWeight=" + maxFoodWeight + ", model=" + model + ", power=" + power + ", brand="
				+ brand + ", microwavePower=" + microwavePower + "]";
	}
	
}
