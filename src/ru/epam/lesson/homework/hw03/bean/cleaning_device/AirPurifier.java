package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;

public class AirPurifier extends CleaningDevice
{		
	private int coolingPower;
	
	public AirPurifier(String model, int power, Brand brand, int spaceSize, int coolingPower) {
		super(model, power, brand, spaceSize);
		this.coolingPower = coolingPower;
	}

	public int getCoolingPower() {
		return coolingPower;
	}

	public void setCoolingPower(int spaceSize) {
		this.coolingPower = spaceSize;
	}

	@Override
	public String toString() {
		return "AirPurifier [coolingPower=" + coolingPower + ", SpaceSize=" + getSpaceSize() + ", Power="
				+ getPower() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", on=" + isOn() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + coolingPower;
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
		AirPurifier other = (AirPurifier) obj;
		if (coolingPower != other.coolingPower)
			return false;
		return true;
	}

	
}
