package ru.epam.lesson.homework.hw03.bean.room;

import java.util.ArrayList;

import ru.epam.lesson.homework.hw03.bean.ElectronicDevice;

public class Room 
{
	private ArrayList<ElectronicDevice> devices;
	private int maxPower;
	private int usedPower;
	
	public Room(ArrayList<ElectronicDevice> devices, int maxPower) {		
		this.devices = devices;
		this.maxPower = maxPower;
	}

	public ArrayList<ElectronicDevice> getDevices() {
		return devices;
	}

	public void setDevices(ArrayList<ElectronicDevice> devices) {
		this.devices = devices;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getUsedPower() {
		return usedPower;
	}

	public void setUsedPower(int usedPower) {
		this.usedPower = usedPower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((devices == null) ? 0 : devices.hashCode());
		result = prime * result + maxPower;
		result = prime * result + usedPower;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (devices == null) {
			if (other.devices != null)
				return false;
		} else if (!devices.equals(other.devices))
			return false;
		if (maxPower != other.maxPower)
			return false;
		if (usedPower != other.usedPower)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [devices=" + devices + ", maxPower=" + maxPower + ", usedPower=" + usedPower + "]";
	}

	
}
