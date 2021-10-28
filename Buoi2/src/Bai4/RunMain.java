package Bai4;

import java.util.Scanner;
public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		str = str.trim();
		str = str.toLowerCase();
		str = str.replaceAll("[0-9]", "");
		str = str.replaceAll("\\s+", " ");
		
		char[] char1 = str.toCharArray();
		char1[0] = Character.toUpperCase(char1[0]);
		for (int i = 0; i < char1.length; i++) {
			if (Character.isLetter(char1[i]) == false) {
				char1[i+1] = Character.toUpperCase(char1[i+1]);
			}
		}
		str = String.valueOf(char1);
		System.out.println(str);
				
	}		
}
