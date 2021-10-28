package Bai3;

import java.util.Scanner;
public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.print("Enter string: ");
		s = sc.nextLine();
		int count = 0, sum = 0;
		for (int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) >= '0'  && s.charAt(i) <= '9') {
				count++;
				sum += Integer.parseInt(String.valueOf(s.charAt(i)));
			} 
		}
		
		if (count != 0) {
			System.out.println("True");
			System.out.println("TBC = " + (float)sum/count);
		} else {
			System.out.println("false");
		}
	}
}
