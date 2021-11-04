package Bai1;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		Book[] books;
		
		do {
			System.out.print("Enter n:" );
			n = sc.nextInt();
		} while (n <= 0);
		books = new Book[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter book " + (i+1));
			books[i] = new Book();
			books[i].Input();
		}

		
		System.out.println("-------------------List books------------------------");
		System.out.printf("%-10s%-15s%-15s%-10s%-10s\n", "Ma sach", "Ten sach", "NXB", "So trang", "Gia tien");
		for (int i = 0; i < n; i++) {
			books[i].Output();
		}
		
	}
}
