package com.practise.basics;

import java.util.Scanner;

public class InputOutputPractise1 {
/*
 * Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
Minimum dimension of the picture can be L x L, where L is the length of the side of square.

Now Roy has N photos of various dimensions.
Dimension of a photo is denoted as W x H 
where W - width of the photo and H - Height of the photo

When any photo is uploaded following events may occur:

[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
[2] If width and height, both are large enough and 
(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP IT" in this case.

(quotes are only for clarification)

Given L, N, W and H as input, print appropriate text as output.

Input:
First line contains L.
Second line contains N, number of photos.
Following N lines each contains two space separated integers W and H.

Output:
Print appropriate text for each photo in a new line.

Constraints:
1 <= L,W,H <= 10000
1 <= N <= 1000
 */
	public static void main(String[] args) {
		//First line contains L.
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		
		//Second line contains N, number of photos.
		int N=sc.nextInt();
		//int W=0,H=0;
		//Following N lines each contains two space separated integers W and H.
		for (int i = 0; i < N; i++) {
			//W=sc.nextInt();
			//H=sc.nextInt();
			//It is taking space
			String s=sc.nextLine();
			 
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
				else {
					if (W==H) {
						System.out.println("ACCEPTED");
					}
					else {
						System.out.println("CROP IT");

					}
				}
			}
		}
		

}
