package com.ag.ui;

import java.util.Scanner;

public class StrarPrint {
	
	public static void printPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPattern(n);
	}
}
