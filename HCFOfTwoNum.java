package com.ag.ui;

import java.util.Scanner;

public class HCFOfTwoNum {
	public static int hcf(int num1, int num2) {
		if(num1 == 0) {
			return num2;
		}
		if(num2 == 0) {
			return num1;
		}
		
		if(num1 == num2) {
			return num1;
		}
		
		return (num1>num2)? hcf(num1-num2, num2) : hcf(num1, num2-num1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = hcf(num1,num2);
		System.out.println(result);
	}
}
