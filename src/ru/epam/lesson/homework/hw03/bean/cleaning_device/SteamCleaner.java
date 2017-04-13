package ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.steam_cleaner;

import ru.epam.lesson.homework.hw03.Brand;
import ru.epam.lesson.homework.hw03.bean.cleaning_device.vacuum_cleaner.VacuumCleaner;

public class SteamCleaner extends VacuumCleaner
{	
	protected int maxSteamTemperature;
	
	public SteamCleaner(String model, int power, Brand brand, int programCount, int maxSteamTemperature) {
		super(model, power, brand, programCount);
		this.maxSteamTemperature = maxSteamTemperature;
	}

	public int getMaxSteamTemperature() {
		return maxSteamTemperature;
	}

	public void setMaxSteamTemperature(int maxSteamTemperature) {
		this.maxSteamTemperature = maxSteamTemperature;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxSteamTemperature;
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
		SteamCleaner other = (SteamCleaner) obj;
		if (maxSteamTemperature != other.maxSteamTemperature)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SteamCleaner [programCount=" + programCount + ", model=" + model + ", power=" + power + ", brand="
				+ brand + ", maxSteamTemperature=" + maxSteamTemperature + "]";
	}
	
	
}
