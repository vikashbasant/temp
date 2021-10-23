package com.ag.ui;

import java.util.Scanner;

public class IsArmstrong {
	
	public static int digitCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static boolean isArmst(int num) {
		int copyNum = num;
		// count number of digit in num:
		int count = digitCount(num);
		
		int tempSum = 0;
		while(num>0) {
			tempSum +=Math.pow(num%10, count);
			num/=10;
		}
		
		return (copyNum == tempSum) ? true : false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		boolean ans = isArmst(num);
		System.out.println(ans);
	}
}
