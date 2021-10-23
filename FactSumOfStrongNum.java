package com.ag.ui;

import java.util.Scanner;

public class FactSumOfStrongNum {
	
	public static int fact(int num) {
		if(num==0 || num == 1) {
			return 1;
		}
		return num*fact(num-1);
	}
	public static int factorialSum(int num) {
		int factSum = 0;
		while(num>0) {
			factSum += fact(num%10);
			num/=10;
		}
		return factSum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = factorialSum(num);
		System.out.println(result);
	}
}
