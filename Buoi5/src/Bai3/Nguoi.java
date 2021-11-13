package Bai3;

import java.util.Scanner;

public class Nguoi {
	Scanner sc = new Scanner(System.in);
	
	private String fullName;
	private String dayOfBirthd;
	private String homeTown;
	
	public void Input() {
		System.out.print("Enter fullname: ");
		fullName = sc.nextLine();
		System.out.print("Enter day of birthday: ");
		dayOfBirthd = sc.nextLine();
		System.out.print("Enter hometown: ");
		homeTown = sc.nextLine();
	}
	
	public void Output() {
		System.out.println("Ho ten: " + fullName);
		System.out.println("Ngay sinh: " + dayOfBirthd);
		System.out.println("QueQuan: " + homeTown);
	}
}
