package Bai2;

import java.util.Scanner;

public class SanPham {
	Scanner sc = new Scanner(System.in);
	
	private String idProduct;
	private String nameProduct;
	private int quantity;
	private double price;
	
	public void InputProduct () {
		System.out.print("Enter product id: ");
		idProduct = sc.nextLine();
		System.out.print("Enter product name: ");
		nameProduct = sc.nextLine();
		System.out.print("Enter quantily: ");
		quantity = sc.nextInt();
		System.out.print("Enter price: ");
		price = sc.nextInt();
	}
	
	public void OutputProduct () {
		double total;
		total = quantity * price;
		System.out.printf("%-15s%-15s%-10s%-10s%-15s\n",idProduct, nameProduct, quantity, price, total);
	}
}
