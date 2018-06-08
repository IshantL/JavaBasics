package com.practise.examples;
import java.util.*;

public class RemovingDuplicatesInArrayWithCollection {

	public static void main(String[] args) {
		List<String> list = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");
		
       HashSet<String> hashSet = new HashSet<String>(list); // Will not follow insertion order
       
       LinkedHashSet<String> linkedSet = new LinkedHashSet<String>(list); // Will  follow insertion order
       
       list = new ArrayList<String>(linkedSet);
      /* 
       Object[] arr = (Object[]) list.toArray();     Converting arraylist to array
       System.out.println(arr);*/
       System.out.println(list);
	}
	
	/*
	 * If they asked to find only check whether it has duplicates or not
	 * compare the size of list and hashset, if change in size, then duplicates exists
	 */

}
