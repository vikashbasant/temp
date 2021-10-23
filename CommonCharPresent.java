package com.ag.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonCharPresent {
	
	public static boolean isCommonChar(String str1, String str2) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str1.length(); i++) {
			int old = map.getOrDefault(str1.charAt(i), 0);
			map.put(str1.charAt(i), old+1);
		}
		
		for(int i=0; i<str2.length(); i++) {
			if(map.containsKey(str2.charAt(i))){
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		boolean result = isCommonChar(str1, str2);
		System.out.println(result);
		
	}
}
