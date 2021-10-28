package Bai1;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,  b, c;
		System.out.print("Enter a: ");
		a = sc.nextInt();
		
		System.out.print("Enter b: ");
		b = sc.nextInt();
		
		System.out.print("Enter c: ");
		c = sc.nextInt();
		
		System.out.print("Max = " + Math.max(a, Math.max(b, c)));
		
	}
}
