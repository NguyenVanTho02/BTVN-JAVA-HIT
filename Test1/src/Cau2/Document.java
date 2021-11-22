package Cau2;

import java.util.Scanner;

public class Document {

	Scanner sc = new Scanner(System.in);

	protected int id;
	protected String name;
	protected String publisher;
	protected double price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void Input() {
		System.out.print("Enter id: ");
		id = sc.nextInt();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter publisher: ");
		publisher = sc.nextLine();
		System.out.print("Enter price: ");
		price = sc.nextDouble();
	}
	
	public void Output() {
		System.out.printf("%-5s%-15s%-15s%-10s", id, name, publisher, price);
	}
	
	
}
