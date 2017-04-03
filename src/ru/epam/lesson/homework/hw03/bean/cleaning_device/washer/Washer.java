package ru.epam.lesson.homework.hw03.bean.cleaning_device.washer;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.CleaningDevice;

public class Washer extends CleaningDevice
{	
	protected int maxLoadWeight;
	protected int programCount;
	
	public Washer(String model, int power, Brand brand, int maxLoadWeight, int programCount) {
		super(model, power, brand);
		this.maxLoadWeight = maxLoadWeight;
		this.programCount = programCount;
	}
	
	public void washClothes()
	{
		System.out.println("Washing Clothes");
	}

	public int getMaxLoadWeight() {
		return maxLoadWeight;
	}

	public void setMaxLoadWeight(int maxLoadWeight) {
		this.maxLoadWeight = maxLoadWeight;
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
		result = prime * result + maxLoadWeight;
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
		Washer other = (Washer) obj;
		if (maxLoadWeight != other.maxLoadWeight)
			return false;
		if (programCount != other.programCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Washer [model=" + model + ", power=" + power + ", brand=" + brand + ", maxLoadWeight=" + maxLoadWeight
				+ ", programCount=" + programCount + "]";
	}
	
	
}
