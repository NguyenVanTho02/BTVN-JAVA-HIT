package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
	Scanner sc = new Scanner(System.in);
	
	private String idCard;
	private String nameCard;
	private DateTime a;
	ArrayList<SanPham> x = new ArrayList<>(); 
	private int n;
	
	public void InputCard() {
		System.out.print("Enter card id: ");
		idCard = sc.nextLine();
		System.out.print("Enter card name: ");
		nameCard = sc.nextLine();
		a = new DateTime();
		a.InputDate();
		
		do {
			System.out.print("Enter n: ");
			n = sc.nextInt();
		} while (n <= 0);
		
		for (int i = 0; i < n; i++) {
			SanPham s = new SanPham();
			s.InputProduct();
			x.add(s);
		}
	}
	
	public void OutputCard() {
		System.out.println("\nMa phieu: " + idCard);
		System.out.println("Ten phieu: " + nameCard);
		System.out.print("Ngay: ");
		a.OutputDate();
		
		System.out.println("\n---------------List products------------------");
		System.out.printf("%-15s%-15s%-10s%-10s%-15s\n","Ma SP", "Ten SP", "So luong", "Don gia", "Thanh tien");
		for (int i = 0; i < n; i++) {
			x.get(i).OutputProduct();
		}
	}
}
