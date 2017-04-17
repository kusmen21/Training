package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;

public class Microwave extends Oven
{		
	private int microwavePower;
	
	public Microwave(String model, int power, Brand brand, int maxFoodWeight, int maxTemperature, int microwavePower) {
		super(model, power, brand, maxFoodWeight, maxTemperature);
		this.microwavePower = microwavePower;
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
		return "Microwave [microwavePower=" + microwavePower + ", MaxTemperature=" + getMaxTemperature()
				+ ", MaxFoodWeight=" + getMaxFoodWeight() + ", Power=" + getPower() + ", Brand="
				+ getBrand() + ", Model=" + getModel() + ", On=" + isOn() + "]";
	}

	
	
}
