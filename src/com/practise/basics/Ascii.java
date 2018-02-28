package com.practise.basics;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		char chr=ch.charAt(0);
		int ascii=(int)chr;
		System.out.println(ascii);
	}

}
