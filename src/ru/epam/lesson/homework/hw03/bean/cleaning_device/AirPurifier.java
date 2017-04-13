package ru.epam.lesson.homework.hw03.bean.cleaning_device.air_purifier;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.CleaningDevice;

public class AirPurifier extends CleaningDevice
{	
	// размер очищаемой\охлаждаемой области
	protected int spaceSize;
	
	public AirPurifier(String model, int power, Brand brand, int spaceSize) {
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
		AirPurifier other = (AirPurifier) obj;
		if (spaceSize != other.spaceSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AirPurifier [model=" + model + ", power=" + power + ", brand=" + brand + ", spaceSize=" + spaceSize
				+ "]";
	}
	
	
	
}
