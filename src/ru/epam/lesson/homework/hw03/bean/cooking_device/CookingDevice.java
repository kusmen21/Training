package ru.epam.lesson.homework.hw03.bean.cooking_device;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public class CookingDevice extends ElectronicDevice
{
	public CookingDevice(String model, int power, Brand brand) {
		super(model, power, brand);		
	}

	public void cook()
	{
		System.out.println("Cooking food");
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
		return "CookingDevice [model=" + model + ", power=" + power + ", brand=" + brand + "]";
	}	
}
