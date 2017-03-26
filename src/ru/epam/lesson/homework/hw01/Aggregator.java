package ru.epam.lesson.homework.hw01;

/**
 * Класс для тестирования односвязного списка
 **/
public class Aggregator 
{
	public static void main(String[] args)
	{		
		MyCollection<String> collection = new MyCollection<>();
		collection.addLast("last");
		collection.addFirst("first");	
		collection.addLast("again_last");			
		collection.addFirst("again_first");
		collection.addMiddle("middle");			
		
		collection.print();
		
		System.out.println("\ncontains \"first\" = " + collection.contains("first"));
		System.out.println("contains \"second\" = " + collection.contains("second"));
		
		System.out.println("\ndeleting \"again_first\"");
		collection.remove("again_first");
		System.out.println();
		collection.print();
	}
}
