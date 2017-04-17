package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;

public class AirConditioning extends AirPurifier
{	
	private int maxTemperature;
	private int minTemperature;
	
	public AirConditioning(String model, int power, Brand brand, int spaceSize, int coolingPower, int max, int min) {
		super(model, power, brand, spaceSize, coolingPower);
		this.maxTemperature = max;
		this.minTemperature = min;
	}	

	public int getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public int getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(int minTemperature) {
		this.minTemperature = minTemperature;
	}

	@Override
	public String toString() {
		return "AirConditioning [maxTemperature=" + maxTemperature + ", minTemperature=" + minTemperature
				+ ", CoolingPower=" + getCoolingPower() + ", SpaceSize=" + getSpaceSize() + ", Power="
				+ getPower() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", on=" + isOn() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxTemperature;
		result = prime * result + minTemperature;
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
		AirConditioning other = (AirConditioning) obj;
		if (maxTemperature != other.maxTemperature)
			return false;
		if (minTemperature != other.minTemperature)
			return false;
		return true;
	}



}
