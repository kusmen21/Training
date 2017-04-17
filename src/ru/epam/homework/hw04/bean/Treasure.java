package ru.epam.homework.hw04.bean;

import java.lang.reflect.Field;
import java.util.List;

public class Treasure 
{
	private int id;
	
	public Treasure(int id){
		this.id = id;
	}
	
	public void initialize(List<String> parameters) {
		try {
			int i = 1;
			for (Field field : this.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				if (field.getType().isPrimitive()) 
				{
					if (field.getType().toString().equals("double")) {
						field.setDouble(this, Double.parseDouble(parameters.get(i)));
					} else if (field.getType().toString().equals("double"))
					{
						field.setInt(this, Integer.parseInt(parameters.get(i)));
					}
				}else if (field.getType().equals(String.class))
				{
					field.set(this, parameters.get(i));
				}
				i++;
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {			
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
