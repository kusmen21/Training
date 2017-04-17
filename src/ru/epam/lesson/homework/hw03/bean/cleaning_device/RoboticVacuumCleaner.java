package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;

public class RoboticVacuumCleaner extends VacuumCleaner
{
	private int maxCleaningTime;
	
	public RoboticVacuumCleaner(String model, int power, Brand brand, int spaceSize, int programCount, int maxCleaningTime) {
		super(model, power, brand, spaceSize, programCount);
		this.maxCleaningTime = maxCleaningTime;
	}

	public int getMaxCleaningTime() {
		return maxCleaningTime;
	}

	public void setMaxCleaningTime(int maxCleaningTime) {
		this.maxCleaningTime = maxCleaningTime;
	}

	@Override
	public String toString() {
		return "RoboticVacuumCleaner [maxCleaningTime=" + maxCleaningTime + ", ProgramCount=" + getProgramCount()
				+ ", SpaceSize=" + getSpaceSize() + ", Power=" + getPower() + ", Brand=" + getBrand()
				+ ", Model=" + getModel() + ", on=" + isOn() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxCleaningTime;
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
		RoboticVacuumCleaner other = (RoboticVacuumCleaner) obj;
		if (maxCleaningTime != other.maxCleaningTime)
			return false;
		return true;
	}

	
}
