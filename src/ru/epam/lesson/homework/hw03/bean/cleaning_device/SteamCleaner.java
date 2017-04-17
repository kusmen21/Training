package ru.epam.lesson.homework.hw03.bean.cleaning_device;

import ru.epam.lesson.homework.hw03.Brand;

public class SteamCleaner extends VacuumCleaner
{	
	private int maxSteamTemperature;
	
	public SteamCleaner(String model, int power, Brand brand, int spaceSize, int programCount, int maxSteamTemperature) {
		super(model, power, brand, spaceSize, programCount);
		this.maxSteamTemperature = maxSteamTemperature;
	}

	public int getMaxSteamTemperature() {
		return maxSteamTemperature;
	}

	public void setMaxSteamTemperature(int maxSteamTemperature) {
		this.maxSteamTemperature = maxSteamTemperature;
	}

	@Override
	public String toString() {
		return "SteamCleaner [maxSteamTemperature=" + maxSteamTemperature + ", ProgramCount=" + getProgramCount()
				+ ", SpaceSize=" + getSpaceSize() + ", Power=" + getPower() + ", Brand=" + getBrand()
				+ ", Model=" + getModel() + ", on=" + isOn() + "]";
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

	
}
