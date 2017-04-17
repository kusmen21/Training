package ru.epam.lesson.homework.hw02;

import java.util.Arrays;


public class Aggregator 
{
	public static void main(String[] args)
	{		
		int[] originalArray = {4, 6, 2, 1, 9, 0, 3, 7, 8, 5};
		int[] array = originalArray;
		
		SortUtility.selectionSort(array);
		Arrays.stream(array).forEach(System.out :: print);	
		System.out.println();
		
		array = originalArray;
		SortUtility.insertionSort(array);
		Arrays.stream(array).forEach(System.out :: print);	
		System.out.println();
		
		array = originalArray;
		SortUtility.bubbleSort(array);
		Arrays.stream(array).forEach(System.out :: print);	
		System.out.println();
		
		array = originalArray;
		SortUtility.quickSort(array);
		Arrays.stream(array).forEach(System.out :: print);				
	}
}
