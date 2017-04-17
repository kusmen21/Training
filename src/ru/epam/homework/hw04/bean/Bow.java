package ru.epam.homework.hw04.bean;

import java.util.List;

public class Bow extends Treasure
{	
	private String title;
    private String type;
    private double size;
    private String arrow_type;
    private int arrow_count;
    private double damage;
    private double price;
    
    public Bow(List<String> parameters) {
		super(Integer.parseInt(parameters.get(0)));		
		initialize(parameters);	
	}

	@Override
	public String toString() {
		return "Bow [Id=" + getId() + ", title=" + title + ", type=" + type + ", size=" + size + ", arrow_type="
				+ arrow_type + ", arrow_count=" + arrow_count + ", damage=" + damage + ", price=" + price + "]";
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

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getArrow_count() {
		return arrow_count;
	}

	public void setArrow_count(int arrow_count) {
		this.arrow_count = arrow_count;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getArrow_type() {
		return arrow_type;
	}

	public void setArrow_type(String arrow_type) {
		this.arrow_type = arrow_type;
	}
    
    
}
