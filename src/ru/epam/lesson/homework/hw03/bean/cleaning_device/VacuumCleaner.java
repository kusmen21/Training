package ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.CleaningDevice;

public class VacuumCleaner extends CleaningDevice
{	
	protected int programCount;
	
	public VacuumCleaner(String model, int power, Brand brand, int programCount) {
		super(model, power, brand);
		this.programCount = programCount;
	}
	
	public void cleanFloor()
	{
		System.out.println("Cleaning Floor");
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

	@Override
	public String toString() {
		return "VacuumCleaner [model=" + model + ", power=" + power + ", brand=" + brand + ", programCount="
				+ programCount + "]";
	}
	
}
