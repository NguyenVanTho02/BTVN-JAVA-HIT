package Bai4;

import java.util.Scanner;

public class Machine {
	
	Scanner sc = new Scanner(System.in);
	
	private String idMachine;
	private String styleMachine;
	private String status;
	
	public void Input() {
		System.out.print("Enter machine id: ");
		idMachine = sc.nextLine();
		System.out.print("Enter machine style: ");
		styleMachine = sc.nextLine();
		System.out.print("Enter status: ");
		status = sc.nextLine();
	}
	
	public void  Output() {
		System.out.printf("%-15s%-15s%-15s\n", idMachine, styleMachine, status);
	}
}
