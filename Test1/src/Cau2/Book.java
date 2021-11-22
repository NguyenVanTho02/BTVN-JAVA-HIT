package Cau2;

import java.util.Scanner;

public class Book extends Document {
	Scanner sc = new Scanner(System.in);
	
	private int numberOfPage;
	private String author;
	
	public int getNumberOfPage() {
		return numberOfPage;
	}
	
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void Input() {
		super.Input();
		System.out.print("Enter number of page: ");
		numberOfPage = sc.nextInt();
		System.out.print("Enter author: ");
		author = sc.nextLine();
	}
	
	public void Output() {
		super.Output();
		System.out.printf("%-10s%-15s\n", numberOfPage, author);
	}
}
