package ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.robotic_vacuum_cleaner;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.VacuumCleaner;

public class RoboticVacuumCleaner extends VacuumCleaner
{
	public RoboticVacuumCleaner(String model, int power, Brand brand, int programCount) {
		super(model, power, brand, programCount);		
	}

	public void autoCleanFloor()
	{
		System.out.println("Auto Cleaning Floor");
	}
	
	@Override	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "RoboticVacuumCleaner [programCount=" + programCount + ", model=" + model + ", power=" + power
				+ ", brand=" + brand + "]";
	}
	
	
}
