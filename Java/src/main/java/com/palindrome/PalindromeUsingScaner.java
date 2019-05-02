package com.palindrome;

import java.util.Scanner;

public class PalindromeUsingScaner {
	public static void main(String []args){
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your text to Palindrome");
       String str = sc.next();
       String reverse = new StringBuffer(str).reverse().toString();
       System.out.println("Reverse");
       System.out.println(reverse);
        if(str.equals(reverse))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
     }
}


