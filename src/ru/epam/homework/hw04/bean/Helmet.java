package ru.epam.homework.hw04.bean;

import java.util.List;

public class Helmet extends Treasure 
{	
	private String title;
    private String type;
    private String material;
    private double headProtection;   
    private double headCircumference;
    private double price;
    
    public Helmet(List<String> parameters) {
		super(Integer.parseInt(parameters.get(0)));		
		initialize(parameters);	
	}

	@Override
	public String toString() {
		return "Helmet [Id=" + getId() + ", title=" + title + ", type=" + type + ", material=" + material
				+ ", headProtection=" + headProtection + ", headCircumference=" + headCircumference + ", price=" + price
				+ "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getHeadProtection() {
		return headProtection;
	}

	public void setHeadProtection(double headProtection) {
		this.headProtection = headProtection;
	}

	public double getHeadCircumference() {
		return headCircumference;
	}

	public void setHeadCircumference(double headCircumference) {
		this.headCircumference = headCircumference;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
