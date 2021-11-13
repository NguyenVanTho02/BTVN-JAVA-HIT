package Bai2;

import java.util.Scanner;

public class DateTime {
	Scanner sc = new Scanner(System.in);
	
	private int day;
	private int month;
	private int year;
	
	public void InputDate() {
		System.out.print("Enter day: ");
		day = sc.nextInt();
		System.out.print("Enter month: ");
		month = sc.nextInt();
		System.out.print("Enter year: ");
		year = sc.nextInt();
	}
	
	public void OutputDate() {
		System.out.print(day + "/" + month + "/" + year);
	}
}
