package com.practise.examples;
import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class OtherConcepts {

	public static void main(String[] args) {
		
		
		/*Below four tricks are available in java to copy an array.

		Using “For loop”
		Using “Arrays.copyOf()” method
		Using “System.arraycopy()” method
		Using “clone()” method*/
		int[] a = {1,2,3};
	    int[] b = a.clone();

	    System.out.println(a == b ? "Same Instance":"Different Instance");
	    
	    int[] c = Arrays.copyOf(a, 5);
	    System.out.println(Arrays.toString(c));
	    
	   
	   
	    
	    
	    int array[] = new int[6];
	    
	    Arrays.fill(array, 100);
	     
	    for (int i = 0, n = array.length; i < n; i++) {
	     
	    System.out.println(array[i]);
	     
	    }
	     
	    System.out.println();
	     
	    Arrays.fill(array, 3, 6, 50);
	     
		for (int i = 0, n = array.length; i < n; i++) {

			System.out.println(array[i]);}
		
		
		System.out.println(Integer.MAX_VALUE);
		
		
		List<Long> list = new ArrayList<Long>();
		list.add(Long.valueOf(10));
		List<Number> nList= list;
		nList.add(Double.valueOf(10.00));
		
		

		

	}
	
	public static <T> boolean isExists(final T[] array, final T object) {
		return Arrays.asList(array).contains(object); }
		
		
		
		public static <T> boolean isExists1(final T[] array, final T object) {
		 
		return Arrays.asList(array).contains(object); }

}
