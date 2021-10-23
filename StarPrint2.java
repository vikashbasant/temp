package com.ag.ui;

import java.util.Scanner;

public class StarPrint2 {
	public static void printPattern(int rows, int cols) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=cols; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		
		printPattern(height, width);
	}
}
