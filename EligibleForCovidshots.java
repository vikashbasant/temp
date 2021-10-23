package com.ag.ui;
/**
 * 
 * @author Ram
 * Question 3
 *
 */

import java.util.Scanner;

public class EligibleForCovidshots {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age>60) {
			System.out.println("Eligible Now");
		}else if(age>45) {
			System.out.println("Eligible in 15 days");
		}else if(age>18) {
			System.out.println("Eligible in a month");
		}else {
			System.out.println("Not Eligible");
		}
	}
}
