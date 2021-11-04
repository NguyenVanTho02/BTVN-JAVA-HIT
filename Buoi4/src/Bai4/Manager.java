package Bai4;

import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	
	private String idManager;
	private String fullName;
	
	public void Input() {
		System.out.print("Enter manager id: ");
		idManager = sc.nextLine();
		System.out.print("Enter full name: ");
		fullName = sc.nextLine();
	}
	
	public void Output() {
		System.out.println("ID Manager: " + idManager);
		System.out.println("Full name: " + fullName);
	}
}
