package com.ag.ui;

import java.util.Scanner;

/**
 * 
 * Question 14
 *
 */
public class PayForWorkingHours {
	public static int PayRate = 250;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		
		if(hours>8) {
			System.out.println(PayRate*8);
		}else if(hours>0 && hours<=8) {
			System.out.println(PayRate*hours);
		}
	}
}
