package com.ag.ui;

import java.util.Scanner;

public class CountDenomination {
	private static int printDenomination(int amount) {
		int count = 0;
		while(amount>0) {
			int arr[] = {500,200,100,50,20,10,5,2,1};
			
			for(int i=0; i<arr.length; i++) {
				if(amount/arr[i]!=0) {
					//System.out.println(arr[i]+"*"+amount/arr[i]+" = "+ (arr[i]*(amount/arr[i])));
					count++;
					amount = amount%arr[i];
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		System.out.println(printDenomination(amount));
	}
}


	
	
