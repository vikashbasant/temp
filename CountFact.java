package com.ag.ui;

import java.util.Scanner;

public class CountFact {
	
	public static int countF(int n) {
		int count = 2;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				if(i == n/i) {
					count++;
				}else {
					count+=2;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = countF(n);
		System.out.println(result);
	}
}
