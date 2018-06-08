package com.practise.examples;
import java.util.*;
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(firstNonRepeatingChar(s));

	}

	private static char firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<>();
		ArrayList<Character> nonRepeatiting = new ArrayList<>();
		
		for(int i=0;i<word.length();i++) {
			char letter = word.charAt(i);
			if(repeating.contains(letter)) {
				continue;
			}if(nonRepeatiting.contains(letter)) {
				nonRepeatiting.remove((Character)letter);
				repeating.add(letter);
			} else {
				nonRepeatiting.add(letter);
			}
		}
	 return nonRepeatiting.get(0);
	}

}
