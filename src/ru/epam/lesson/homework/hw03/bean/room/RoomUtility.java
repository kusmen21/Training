package ru.epam.lesson.homework.hw03.bean.room;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public final class RoomUtility 
{
	private final static Logger LOGGER = Logger.getLogger("RoomLogger");
	
	private RoomUtility(){}
	
	public static void sortByPower(Room room)
	{		
		Collections.sort(room.getDevices(), new SortByPowerComparator());;		
	}
	
	public static ArrayList<ElectronicDevice> searchDevice(Room room, Brand brand)
	{
		ArrayList<ElectronicDevice> result = new ArrayList<ElectronicDevice>();
		room.getDevices()
		.stream()
		.filter(e -> e.getBrand().equals(brand))		
		.forEach(result :: add);
		return result;
	}
	
	public static ArrayList<ElectronicDevice> searchDevice(Room room, Brand brand, int power)
	{
		ArrayList<ElectronicDevice> result = new ArrayList<ElectronicDevice>();
		room.getDevices()
		.stream()
		.filter(e -> e.getBrand().equals(brand))
		.filter(e -> e.getPower() > power)
		.forEach(result :: add);
		return result;
	}
	
	public static ArrayList<ElectronicDevice> searchDevice(Room room, Brand brand, int power, String model)
	{
		ArrayList<ElectronicDevice> result = new ArrayList<ElectronicDevice>();
		room.getDevices()
		.stream()
		.filter(e -> e.getBrand().equals(brand))
		.filter(e -> e.getPower() > power)
		.filter(e -> e.getModel().equals(model))
		.forEach(result :: add);
		return result;
	}
	
	public static boolean turnOnDevice(Room room, int... deviceNumbers)
	{
		int totalPower = 0;
		
		for (int number : deviceNumbers)
		{
			totalPower += room.getDevices().get(number).getPower();			
		}
		
		if (room.getMaxPower() >= totalPower && (room.getMaxPower() - room.getUsedPower()) >= totalPower)
		{
			for (int number : deviceNumbers)
			{
				room.getDevices().get(number).setOn(true);					
				room.setUsedPower(room.getUsedPower() + room.getDevices().get(number).getPower());
				LOGGER.info(room.getDevices().get(number).getClass().getSimpleName() + " turned ON");
			}
			return true;
		}
		else
		{		
			LOGGER.error("Devices were not turned on, totalPower = " + totalPower + " is too high");
			return false;
		}
	}
	

}
