package com.ag.ui;

import java.util.Scanner;

public class Power {
	public static int powerOfTwoNum(int base, int expo) {
		if(expo == 0) {
			return 1;
		}
		
		return base*powerOfTwoNum(base, expo-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int expo = scan.nextInt();
		int result = powerOfTwoNum(base, expo);
		System.out.println(result);
	}
}
