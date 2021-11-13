package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static void Filter (ArrayList<DieuHoa> a) {
		int dem = 0;
		for (int i = 0;  i < a.size(); i++) {
			if (a.get(i).getNameMF().equals("Electrolux")) {
				dem++;
				a.get(i).Output();
			}
		}
		if(dem == 0) {
			System.out.println("Khong ton tai!");
		}
	}
	
	public static void PriceMin (ArrayList<DieuHoa> a) {
		double min = a.get(0).getPrice();
		for (int i = 0; i < a.size(); i++) {
			if (min > a.get(i).getPrice()) {
				min = a.get(i).getPrice();
			}
		}
		
		for (int i = 0; i < a.size(); i++) {
			if (min == a.get(i).getPrice()) {
				a.get(i).Output();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter number: ");
			n = sc.nextInt();
		} while (n <= 0);
		ArrayList<DieuHoa> a = new ArrayList<>();
		
		System.out.println("------Enter list air conditional--------");
		for (int i = 0; i < n; i++) {
			DieuHoa d = new DieuHoa();
			d.Input();
			a.add(d);
		}
		
		System.out.println("----------List air conditional----------");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Ma SP", "Ten SP", "Ten hang", "Ngay nhap", "Cong suat", "Gia ban");
		for (int i = 0; i < n; i++) {
			a.get(i).Output();
		}
		System.out.println("----------------Electronux------------------");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Ma SP", "Ten SP", "Ten hang", "Ngay nhap", "Cong suat", "Gia ban");
		Filter(a);
		System.out.println("-------------List the cheapest products-------------");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Ma SP", "Ten SP", "Ten hang", "Ngay nhap", "Cong suat", "Gia ban");
		PriceMin(a);
		
	}
}
