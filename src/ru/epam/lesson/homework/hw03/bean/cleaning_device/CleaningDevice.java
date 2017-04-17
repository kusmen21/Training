package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public abstract class CleaningDevice extends ElectronicDevice
{
	private int spaceSize;
	
	public CleaningDevice(String model, int power, Brand brand, int spaceSize) {
		super(model, power, brand);
		this.spaceSize = spaceSize;
	}	

	public int getSpaceSize() {
		return spaceSize;
	}

	public void setSpaceSize(int spaceSize) {
		this.spaceSize = spaceSize;
	}

	@Override
	public String toString() {
		return "CleaningDevice [spaceSize=" + spaceSize + ", Power=" + getPower() + ", Brand=" + getBrand()
				+ ", Model=" + getModel() + ", on=" + isOn() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + spaceSize;
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
		CleaningDevice other = (CleaningDevice) obj;
		if (spaceSize != other.spaceSize)
			return false;
		return true;
	}
	
	
}
