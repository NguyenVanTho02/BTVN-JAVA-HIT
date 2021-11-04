package Bai3;

import java.util.Scanner;

public class Card {
	
	Scanner sc = new Scanner(System.in);
	
	private String idCard;
	private Product[] product;
	private int n;
	
	public void Input() {
		System.out.print("Enter card id: ");
		idCard = sc.nextLine();
		do {
			System.out.print("Enter n: ");
			n = sc.nextInt();
			sc.nextLine();
		} while (n <= 0);
		
		product = new Product[n];
		
		for (int i = 0; i < n; i++) {
			product[i] = new Product();
			System.out.println("Product " + (i+1));
			product[i].Input();
		}
	}
	
	public void Output() {
		System.out.println("\nMa Phieu: " + idCard);
		System.out.println("------------LIST PRODUCT--------------");
		System.out.printf("%-15s%-15s%-15s\n", "Ma hang", "Ten hang", "Don gia");
		for (int i = 0; i < n; i++) {
			product[i].Output();
		}
	}
	
}
