package com.practise.basics;

public class HelloWorld {

	/**
	 * @param args
	 */
public static void sum(int[] x) {
	int total=0;
	for (int i : x) {
		total=total+i;
		System.out.println(i);
	}
	System.out.println(total);
}	
	public static void main(String[] args) {
		//int x=0B1010;
		//double d=0786.0;
		//System.out.println(x);
		//System.out.println("Hello World!"+x);
		int[] a =new int [6];
		//int[][] a =new int[2][3];
		//int[] []a,b;
		//int []  a[],b[];
		//int[] []a,b[];
		//int[][] a =new int [2][];
		int[] r={10,20,30};
		r=a;
		a=r;
		
		//System.out.println(r.length);
		//String[]s=new String[]{"a","aa"};
		//System.out.println(r[0]);
		//new int[]{10,20,30};
		//sum(new int[]{10,20,30,40});
		Object[] a1=new Object[10];
		a1[0]=new Object();
		a1[1]=new String("Ishant");
		a1[2]=new Integer(10);
		Runnable[] r1= new Runnable[10];
		
		Number[] n = new Number[10];
		n[0]=new Integer(10);
		//n[1]=new Number();
		
}

}
