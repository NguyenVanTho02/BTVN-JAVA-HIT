package Bai2;

import java.util.Scanner;

public class Personnel {
	Scanner sc = new Scanner(System.in);
	
	private String idPersonnel;
	private String fullName;
	private Date date;
	
	public void Input() {
		System.out.print("Enter personnel id: ");
		idPersonnel = sc.nextLine();
		System.out.print("Enter full name: ");
		fullName = sc.nextLine();
		date = new Date();
		date.Input();
	}
	
	public void Output() {
		System.out.println("ID personnel: " + idPersonnel);
		System.out.println("Full name: " + fullName);
		System.out.print("Date: ");
		date.Output();
	}
}
