package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;

public class VacuumCleaner extends CleaningDevice
{	
	private int programCount;
	
	public VacuumCleaner(String model, int power, Brand brand, int spaceSize, int programCount) {
		super(model, power, brand, spaceSize);
		this.programCount = programCount;
	}	

	public int getProgramCount() {
		return programCount;
	}

	public void setProgramCount(int programCount) {
		this.programCount = programCount;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [programCount=" + programCount + ", SpaceSize=" + getSpaceSize() + ", Power="
				+ getPower() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", on=" + isOn() + "]";
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (programCount != other.programCount)
			return false;
		return true;
	}

	
}
