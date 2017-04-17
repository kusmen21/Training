package ru.epam.lesson.homework.hw03;

import java.util.ArrayList;

import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.AirConditioning;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.AirPurifier;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.RoboticVacuumCleaner;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.SteamCleaner;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.VacuumCleaner;
import ru.epam.lesson.homework.hw03.bean.cooking_device.CapsularCoffeeMaker;
import ru.epam.lesson.homework.hw03.bean.cooking_device.CoffeeMachine;
import ru.epam.lesson.homework.hw03.bean.cooking_device.CoffeeMaker;
import ru.epam.lesson.homework.hw03.bean.cooking_device.KitchenStove;
import ru.epam.lesson.homework.hw03.bean.cooking_device.Microwave;
import ru.epam.lesson.homework.hw03.bean.cooking_device.Multivariate;
import ru.epam.lesson.homework.hw03.bean.cooking_device.Oven;
import ru.epam.lesson.homework.hw03.bean.room.Room;
import ru.epam.lesson.homework.hw03.bean.room.RoomUtility;

public class Aggregator 
{
	private static ArrayList<ElectronicDevice> devices = new ArrayList<>();	
	
	public static void main(String[] args)
	{
		initializeDevices();
		Room room = new Room(devices, 5000);
		
		System.out.println("Sorting by power:");
		RoomUtility.sortByPower(room);		
		room.getDevices()
		.stream()		
		.forEach((e) -> System.out.println(e.getClass().getSimpleName() + " " + e.getPower()));
		
		System.out.println("\nSearching device that has brand = Panasonic and power > 2000:");
		RoomUtility.searchDevice(room, Brand.PANASONIC, 2000)
		.stream()
		.forEach((e) -> System.out.println(e.getClass().getSimpleName() + " " + e.getBrand() + " " + e.getPower()));
		
		System.out.println("\nTurning on several devices:");
		RoomUtility.turnOnDevice(room, 0, 1, 2);
		
		System.out.println("\nTurning another devices:");
		RoomUtility.turnOnDevice(room, 8, 9);
		
		System.out.println("\nTotal power consumption:");
		System.out.println(room.getUsedPower());
	}
	
	private static void initializeDevices()
	{
		devices.add(new AirConditioning("22qwe2", 2200, Brand.PANASONIC, 40, 1000, 35, 5));
		devices.add(new AirPurifier("456gdfg", 800, Brand.DELONGHI, 20, 400));
		devices.add(new RoboticVacuumCleaner("dd45w", 500, Brand.SONY, 60, 5, 30));
		devices.add(new SteamCleaner("fg45", 1600, Brand.PHILIPS, 100, 4, 200));
		devices.add(new VacuumCleaner("vbvd5", 2100, Brand.PANASONIC, 100, 3));
		devices.add(new CapsularCoffeeMaker("7876g", 400, Brand.PHILIPS, 200, 5, 3));
		devices.add(new CoffeeMachine("rt454", 1200, Brand.DELONGHI, 250, 8, true));
		devices.add(new CoffeeMaker("565fgd4", 900, Brand.DELONGHI, 250, 7));
		devices.add(new KitchenStove("qwe123", 2200, Brand.HORIZONT, 5000, 4));
		devices.add(new Microwave("ghj67", 1200, Brand.LG, 2000, 300, 800));
		devices.add(new Multivariate("cvc23", 100, Brand.HORIZONT, 1500, 300, 12));
		devices.add(new Oven("234dfd", 2100, Brand.PHILIPS, 4000, 500));
	}
	
}
