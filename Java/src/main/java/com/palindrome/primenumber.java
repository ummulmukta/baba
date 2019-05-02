package com.palindrome;

public class primenumber {
/*public static void main(String[] args) {
	String d="";
	for(int i=1;i<=100;i++) {
		int pr=0;
		for(int j=2;j>=i-1;j--) {
			if(i%j==0) {
				pr=pr+1;
			break;
		}
	}
	if(pr==2) {
		d=d+i;
		//System.out.print(i);
		//System.out.print("/t");
	}
}
	System.out.println(d);*/
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			boolean flag=true;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					flag=false;
					//break;
				}
			}
			
			if(flag==true) {
				System.out.print(i);
				System.out.print("\t");
			}
		}
		
		
		
		
		
		
		
	}
}
