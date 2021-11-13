package Bai1;

import java.util.Scanner;

public class SanPham {
	Scanner sc = new Scanner(System.in);
	
	protected String idProduct;
	protected String nameProduct;
	protected String nameMF;
	protected String date;
	
	public void Input() {
		System.out.print("Enter product id: ");
		idProduct = sc.nextLine();
		System.out.print("Enter product name: ");
		nameProduct = sc.nextLine();
		System.out.print("Enter manufacturer name: ");
		nameMF = sc.nextLine();
		System.out.print("Enter date added: ");
		date = sc.nextLine();
	}
	
	public void Output() {
		System.out.printf("%-15s%-15s%-15s%-15s", idProduct, nameProduct, nameMF, date);
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getNameMF() {
		return nameMF;
	}

	public void setNameMF(String nameMF) {
		this.nameMF = nameMF;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
