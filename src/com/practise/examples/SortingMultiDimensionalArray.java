package com.practise.examples;
import java.util.*;
public class SortingMultiDimensionalArray {

	public static void main(String[] args) {
		double[][] array= {
				{1, 5},
				{13, 1.55},
				{12, 100.6},
				{12.1, .85} };

				java.util.Arrays.sort(array, new java.util.Comparator<double[]>() {
				    public int compare(double[] a, double[] b) {
				        return Double.compare(a[0], b[0]); //For reverse sort change this line return Double.compare(b[0], a[0]); 
				    }
				});
				for(double x[] : array) 
					for(double y : x)
						System.out.println(y);
			
	}

}


/*Sorting Object Arrays

Course[] courses = new Course[4]; 
courses[0] = new Course(101, "Java", 200); 
courses[1] = new Course(201, "Ruby", 300); 
courses[2] = new Course(301, "Python", 400); 
courses[3] = new Course(401, "Scala", 500);
System.out.println("Object array before sorting : " + Arrays.toString(courses)); Arrays.sort(courses); 
System.out.println("Object array after sorting in natural order : " + Arrays.toString(courses));

Read more: http://www.java67.com/2014/08/4-examples-to-sort-array-in-java.html#ixzz550MikmaV
*/