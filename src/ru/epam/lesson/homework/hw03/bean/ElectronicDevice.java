package ru.epam.lesson.homework.hw03.bean;

import ru.epam.lesson.homework.hw03.Brand;

public abstract class ElectronicDevice 
{
	private String model;
	private int power;
	private Brand brand;
	private boolean on;
	
	public ElectronicDevice(String model, int power, Brand brand) {		
		this.model = model;
		this.power = power;
		this.brand = brand;
		on = false;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (on ? 1231 : 1237);
		result = prime * result + power;
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
		ElectronicDevice other = (ElectronicDevice) obj;
		if (brand != other.brand)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (on != other.on)
			return false;
		if (power != other.power)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ElectronicDevice [model=" + model + ", power=" + power + ", brand=" + brand + ", on=" + on + "]";
	}


}
