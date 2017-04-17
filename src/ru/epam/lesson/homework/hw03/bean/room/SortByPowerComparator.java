package ru.epam.lesson.homework.hw03.bean.room;

import java.util.Comparator;

import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public class SortByPowerComparator implements Comparator<ElectronicDevice>
{
	@Override
	public int compare(ElectronicDevice o1, ElectronicDevice o2) 
	{
		int power1 = o1.getPower();
		int power2 = o2.getPower();
		if (power1 < power2)
		{
			return -1;
		} else if (power1 == power2)
		{
			return 0;
		} else {
			return 1;
		}
	}

}
