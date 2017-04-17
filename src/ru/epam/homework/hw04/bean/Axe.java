package ru.epam.homework.hw04.bean;

import java.util.List;

public class Axe extends Treasure {
	private String title;
	private String type;
	private String type_handle;
	private String type_blade;
	private double damage;
	private double price;
	
	public Axe(List<String> parameters, boolean isTypical) {
		super(Integer.parseInt(parameters.get(0)));		
		
		long sec = System.nanoTime();
		this.title = parameters.get(1); 
		this.type = parameters.get(2); 
		this.type_handle = parameters.get(3); 
		this.type_blade = parameters.get(4); 
		this.damage = Double.parseDouble(parameters.get(5)); 
		this.price = Double.parseDouble(parameters.get(6));
		long sec2 = System.nanoTime();
		System.out.println("DEFAULT nanos = " + (sec2 - sec));
	}	
	
	public Axe(List<String> parameters) {
		super(Integer.parseInt(parameters.get(0)));		
		initialize(parameters);	
	}

	@Override
	public String toString() {
		return "Axe [Id=" + getId() + ", title=" + title + ", type=" + type + ", type_handle=" + type_handle
				+ ", type_blade=" + type_blade + ", damage=" + damage + ", price=" + price + "]";
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

	public String getType_handle() {
		return type_handle;
	}

	public void setType_handle(String type_handle) {
		this.type_handle = type_handle;
	}

	public String getType_blade() {
		return type_blade;
	}

	public void setType_blade(String type_blade) {
		this.type_blade = type_blade;
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
	
	
}
