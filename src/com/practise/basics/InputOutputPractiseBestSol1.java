package com.practise.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputOutputPractiseBestSol1 {
	
public static void main(String args[] ) throws Exception {
	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int L=Integer.parseInt(br.readLine());
int N=Integer.parseInt(br.readLine());

for(int i=0;i<N;i++)
{
String s=br.readLine();
 
int j=s.indexOf(" ");
char w[]=new char[j];
s.getChars(0,j,w,0);
 
 
char h[]=new char[s.length()-j-1];
s.getChars(j+1, s.length(), h, 0);
String s1=new String(w);
 
String s2=new String(h);
 
int W=Integer.parseInt(s1);
int H=Integer.parseInt(s2);
 
if(W<L||H<L)
System.out.println("UPLOAD ANOTHER");
else
{
if(W==H)
System.out.println("ACCEPTED");
else
System.out.println("CROP IT");
}
}
 
}
}
