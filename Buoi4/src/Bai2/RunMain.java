package Bai2;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Personnel ps = new Personnel();
		System.out.println("\nEnter infomation of personnel: ");
		ps.Input();
		System.out.println("\nInfomation of personnel:");
		ps.Output();
	}
}
