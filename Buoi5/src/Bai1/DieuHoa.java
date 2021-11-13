package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
	Scanner sc = new Scanner(System.in);
	
	private double wattage;
	private double price;
	
	public void Input() {
		super.Input();
		System.out.print("Enter wattage: ");
		wattage = sc.nextDouble();
		System.out.print("Enter price: ");
		price = sc.nextDouble();
	}
	
	public void Output() {
		super.Output();
		System.out.printf("%-15s%-15s\n", wattage, price);
	}

	public double getWattage() {
		return wattage;
	}

	public void setWattage(double wattage) {
		this.wattage = wattage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
