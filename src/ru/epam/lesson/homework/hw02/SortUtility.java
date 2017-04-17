package ru.epam.lesson.homework.hw02;

public final class SortUtility 
{
	private SortUtility(){}	
	
	public static void selectionSort (int[] array){
	    int min, temp;

	    for (int i = 0; i < array.length-1; i++){
	        min = i;
	        for (int j = i+1; j < array.length; j++){
	            if (array[j] < array[min])
	                min = j;
	        }
	        
	        temp = array[min];
	        array[min] = array[i];
	        array[i] = temp;
	    }
	}
	
		
	public static void insertionSort(int[] array) {
	    int temp, j;
	    for(int i = 0; i < array.length - 1; i++){
	        if (array[i] > array[i + 1]) {
	           temp = array[i + 1];
	           array[i + 1] = array[i];      
	           j = i;
	           while (j > 0 && temp < array[j - 1]) {
	               array[j] = array[j - 1];               
	               j--;
	           }
	           array[j] = temp;             
	        }        
	    }
	}	
	
	public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
	}	

	public static void quickSort(int[] array)
	{
		doQuickSort(array, 0, array.length - 1);
	}	
	
	private static void doQuickSort(int[] array, int low, int high) {
	      int i = low;
	      int j = high;
	      int x = array[low+(high-low)/2];
	      
	      do {
	         while(array[i] < x) ++i;
	         while(array[j] > x) --j;
	         if(i <= j){
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	            i ++ ; j --;
	         }
	      } while(i <= j);
	      
	      if(low < j) {
	    	  doQuickSort(array, low, j);
	      }
	      if(i < high) {
	    	  doQuickSort(array, i, high);
	      }
	  }
}
