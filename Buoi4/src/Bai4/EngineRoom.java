package Bai4;

import java.util.Scanner;

public class EngineRoom {
	Scanner sc = new Scanner(System.in);
	
	private String idRoom;
	private String nameRoom;
	private double area;
	private Manager x;
	private Machine[] y;
	private int n;
	
	public void Input() {
		System.out.print("Enter room id: ");
		idRoom = sc.nextLine();
		System.out.print("Enter room name: ");
		nameRoom = sc.nextLine();
		System.out.print("Enter room area: ");
		area = sc.nextInt();
		x = new Manager();
		x.Input();
		do {
			System.out.print("Enter n: ");
			n = sc.nextInt();
			sc.nextLine();
		} while (n <= 0);
		y = new Machine[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Machine " + (i+1));
			y[i] = new Machine();
			y[i].Input();
		}
	}
	
	public void Output() {
		System.out.println("ID room: " + idRoom);
		System.out.println("Name room : " + nameRoom);
		System.out.println("Area room : " + area);
		x.Output();	
		System.out.printf("%-15s%-15s%-15s\n", "Ma may", "Kieu may", "Tinh trang");
		for (int i = 0; i < n; i++) {
			y[i].Output();
		}
	}
}
