package ru.epam.lesson.homework.hw03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.air_purifier.AirPurifier;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.air_purifier.air_conditioning.AirConditioning;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.VacuumCleaner;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.robotic_vacuum_cleaner.RoboticVacuumCleaner;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.steam_cleaner.SteamCleaner;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.washer.Washer;
import ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.CoffeeMaker;
import ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.capsular_coffee_maker.CapsularCoffeeMaker;
import ru.epam.lesson.homework.hw03.bean.cooking_device.coffee_maker.coffee_machine.CoffeeMachine;
import ru.epam.lesson.homework.hw03.bean.cooking_device.kitchen_stove.KitchenStove;
import ru.epam.lesson.homework.hw03.bean.cooking_device.oven.Oven;
import ru.epam.lesson.homework.hw03.bean.cooking_device.oven.bread_maker.BreadMaker;
import ru.epam.lesson.homework.hw03.bean.cooking_device.oven.microwave.Microwave;

/**
 * Таск 3 - Домашние электроприборы
 *
 */
public class Aggregator 
{
	static ArrayList<ElectronicDevice> devices = new ArrayList<>();
	
	static
	{
		devices.add(new Microwave("nms23", 1200, Brand.SAMSUNG, 8, 800));
		devices.add(new Oven("qwe1", 2000, Brand.PHILIPS, 20));
		devices.add(new BreadMaker("11q", 800, Brand.PANASONIC, 1, 300));
		devices.add(new Washer("n1000", 2200, Brand.SONY, 7, 15));
		devices.add(new AirConditioning("hj12", 3000, Brand.SONY, 40, 30, 5));
		devices.add(new AirPurifier("ghgh09", 300, Brand.DELONGHI, 30));
		devices.add(new CoffeeMachine("123123qwe", 1200, Brand.DELONGHI, 8));
		devices.add(new CapsularCoffeeMaker("zx01", 700, Brand.PHILIPS, 5));
		devices.add(new KitchenStove("vbv123", 2300, Brand.HORIZONT, 4));
		devices.add(new SteamCleaner("fg123", 1500, Brand.SAMSUNG, 6, 150));
		devices.add(new CoffeeMaker("er99", 800, Brand.PHILIPS, 9));
		devices.add(new RoboticVacuumCleaner("4545qq", 200, Brand.SONY, 12));
		devices.add(new VacuumCleaner("asd09", 2000, Brand.HORIZONT, 6));
	}
	
	public static void main(String[] args)
	{
		System.out.println("Turning on Electronic Devices:");
		devices
		.stream()
		.forEach(ElectronicDevice :: plugIn);
		
		System.out.println("\nCalculation of power consumption:");		
		int fullPower = 0;
		for (ElectronicDevice e : devices)
		{
			fullPower += e.getPower();
		}
		System.out.println("Full power = " + fullPower);
		
		System.out.println("\nSorting by power:");
		devices
		.stream()
		.sorted((o1, o2) -> o1.getPower() - o2.getPower())
		.forEach((e) -> System.out.println(e.getClass().getSimpleName() + " " + e.getPower()));
		
		System.out.println("\nSearching device that has brand = SONY and power > 2000:");
		devices
		.stream()
		.filter(e -> e.getBrand().equals(Brand.SONY))
		.filter(e -> e.getPower() > 2000)
		.forEach((e) -> System.out.println(e.getClass().getSimpleName() + " " + e.getBrand() + " " + e.getPower()));
	}
	
	
}
