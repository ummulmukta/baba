package com.palindrome;

public class Palindrome {
	/*
	 * public static void main(String[] args) { StringBuffer strBuf1 = new
	 * StringBuffer("sony"); StringBuffer strBuf2 = new StringBuffer("sony");
	 * strBuf2.reverse();
	 * 
	 * 
	 * System.out.println(strBuf2);
	 * System.out.println((strBuf1.toString()).equals(strBuf2.toString())); if
	 * ((strBuf1.toString()).equals(strBuf2.toString()))
	 * System.out.println("palindrome"); else
	 * System.out.println("not a palindrome"); }
	 */
	
	public static void main(String[] args) {
		
		
		StringBuffer ad=new StringBuffer("mom");
		StringBuffer bc=new StringBuffer("mom");
		ad.reverse().toString();
		System.out.println(ad);
		if(ad.toString().equals(bc.toString())){
			System.out.println("This is Palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
		}
	}
