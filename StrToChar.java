package com.ag.ui;

import java.util.Scanner;

public class StrToChar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		char[] arr = str.toCharArray();
		
		
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
	}
}
