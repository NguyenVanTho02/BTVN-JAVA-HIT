package Cau1;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		
		System.out.print("Enter string: ");
		s = sc.nextLine();
		
		int count = 0, result = 1, sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count ++;
				sum += Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int m = Integer.parseInt(String.valueOf(s.charAt(i)));
				if (sum % m == 0) {
					result *= m;
				}	
			}
		}
		
		if (count != 0) {
			System.out.println("Co " + count + " ky tu so");
			System.out.println("Tich: " + result);
		} else {
			System.out.println("Khong co ki tu so");
		}
	}
}
