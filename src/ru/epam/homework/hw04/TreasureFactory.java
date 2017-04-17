package ru.epam.homework.hw04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import ru.epam.homework.hw04.bean.Treasure;

public final class TreasureFactory {
	private TreasureFactory() {
	}

	@SuppressWarnings({"rawtypes", "unchecked"})	
	public static Treasure getTreasure(String treasureType, List<String> parameters) {
		Treasure treasure = null;
		treasureType = treasureType.substring(0, 1).toUpperCase() + treasureType.substring(1).toLowerCase();

		try {
			Class clazz = Class.forName("ru.epam.homework.hw04.bean." + treasureType);
			Constructor constructor = clazz.getConstructor(List.class);
			treasure = (Treasure) constructor.newInstance(parameters);
			clazz.cast(treasure);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return treasure;
	}
}
