package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public class CleaningDevice extends ElectronicDevice
{
	public CleaningDevice(String model, int power, Brand brand) {
		super(model, power, brand);		
	}

	public void clean()
	{
		System.out.println("Cleaning");
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
		return "CleaningDevice [model=" + model + ", power=" + power + ", brand=" + brand + "]";
	}
	
	
}
