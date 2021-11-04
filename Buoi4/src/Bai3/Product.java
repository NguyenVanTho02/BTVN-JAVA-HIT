package Bai3;

import java.util.Scanner;

public class Product {
	Scanner sc = new Scanner(System.in);
	
	private String idProduct;
	private String nameProduct;
	private double price;
	
	public void Input() {
		System.out.print("Enter product id: ");
		idProduct = sc.nextLine();
		System.out.print("Enter product name: ");
		nameProduct = sc.nextLine();
		System.out.print("Enter price: ");
		price = sc.nextDouble();
		
	}
	
	public void Output() {
		System.out.printf("%-15s%-15s%-15s\n", idProduct, nameProduct, price);
	}
	
	public double getPrice() {
		return this.price;
	}
}
