package Bai2;

import java.util.Scanner;

public class Date {
	Scanner sc = new Scanner(System.in);
	
	private int d;
	private int m;
	private int y;
	
	public void Input() {
		System.out.print("Enter day: ");
		d = sc.nextInt();
		System.out.print("Enter month: ");
		m = sc.nextInt();
		System.out.print("Enter year: ");
		y = sc.nextInt();
	}
	
	public void Output() {
		System.out.println(d + "/" + m + "/" + y);
	}
}
