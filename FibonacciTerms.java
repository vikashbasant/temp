package com.ag.ui;

import java.util.Scanner;

public class FibonacciTerms {
	
	public static void genratedFiboTerm(int n) {
		int a, b;
		a=0;
		b=1;
		for(int i=0; i<=n; i++) {
			System.out.print(a+" ");
			int temp = a+b;
			a=b;
			b=temp;
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		genratedFiboTerm(n);
	}
}
