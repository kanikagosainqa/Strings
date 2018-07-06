package strings;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stringPractice {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = inp.nextLine();
		
		//reverse
		String reverse="";
		for(int i=s.length()-1;i>=0;--i) {
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
		
		//palindrome
				if(reverse != s) { 
					System.out.println("Not a Palindrome");;
				} else {
					System.out.println("Palindrome");
				}
				
		//counts no. of words
		String ss[] = s.trim().split(" ");
		System.out.println("no. of word in the string: " + ss.length);
		
		//duplicate characters in a string
		String st[] = s.trim().toLowerCase().split(" ");
		Arrays.sort(st);
		for(int i=0;i<st.length;i++) {
			System.out.println("Sorted:"+st[i]);
		}
		
				
		//anagram
		System.out.println("Enter a word to check whether it is an anagram or not: ");
		String s1 = inp.nextLine();
		String s2 = inp.nextLine();
		String s3 = s1.replaceAll("//s", " ").trim().toLowerCase();
		String s4 = s2.replaceAll("//s", " ").trim().toLowerCase();
		char c1[] = s3.toCharArray();
		char c2[] = s4.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)){
			System.out.print("anagram");
		}
		else {
			System.out.println("Not an anagrams");
	}
		
		
		
	}
}
