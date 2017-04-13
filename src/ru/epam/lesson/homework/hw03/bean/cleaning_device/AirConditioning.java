package ru.epam.lesson.homework.hw03.bean.cleaning_device.air_purifier.air_conditioning;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.air_purifier.AirPurifier;

public class AirConditioning extends AirPurifier
{	
	protected int maxTemperature;
	protected int minTemperature;
	
	public AirConditioning(String model, int power, Brand brand, int spaceSize, int max, int min) {
		super(model, power, brand, spaceSize);
		this.maxTemperature = max;
		this.minTemperature = min;
	}
	
	public void conditioning()
	{
		System.out.println("Conditioning");
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

	@Override
	public String toString() {
		return "AirConditioning [spaceSize=" + spaceSize + ", model=" + model + ", power=" + power + ", brand=" + brand
				+ ", maxTemperature=" + maxTemperature + ", minTemperature=" + minTemperature + "]";
	}
	
	
	
}
