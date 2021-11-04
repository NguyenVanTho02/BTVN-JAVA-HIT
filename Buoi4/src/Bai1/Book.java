package Bai1;

import java.util.Scanner;

public class Book {
	
	Scanner sc = new Scanner(System.in);
	
	private String idBook;
	private String bookTitle;
	private String publisher;
	private int numberOfPages;
	private double price;
	
	public void Input() {
		System.out.print("Enter book id: ");
		idBook = sc.nextLine();
		System.out.print("Enter book title: ");
		bookTitle = sc.nextLine();
		System.out.print("Enter publisher: ");
		publisher = sc.nextLine();
		System.out.print("Enter number of pages: ");
		numberOfPages = sc.nextInt();
		System.out.print("Enter price: ");
		price = sc.nextDouble();
	}
	
	public void Output() {
		System.out.printf("%-10s%-15s%-15s%-10d%-10.2f\n", idBook, bookTitle, publisher, numberOfPages, price);
	}
}
