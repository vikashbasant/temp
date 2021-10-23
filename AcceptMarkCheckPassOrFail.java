package com.ag.ui;

import java.util.Scanner;

/**
 * 
 * @author Ram
 * question 7
 *
 */
public class AcceptMarkCheckPassOrFail {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		
		if(M>90) {
			System.out.println("A+");
		}else if(M>85) {
			System.out.println("A");
		}else if(M>80) {
			System.out.println("B+");
		}else if(M>70) {
			System.out.println("B");
		}else if(M>60){
			System.out.println("C");
		}else if(M>50) {
			System.out.println("D");
		}else {
			System.out.println("Fails");
		}
	}
}
