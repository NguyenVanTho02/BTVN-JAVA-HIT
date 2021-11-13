package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LopHoc a = new LopHoc();
		System.out.println("\n--------Enter information class--------");
		System.out.print("Enter class id: ");
		a.setIdClass(sc.nextLine());
		System.out.print("Enter class name: ");
		a.setNameClass(sc.nextLine());
		System.out.print("Enter open day: ");
		a.setDayOpen(sc.nextLine());
		do {
			System.out.print("Enter n: ");
			int tempN = sc.nextInt();
			a.setN(tempN);	
		} while (a.getN() <= 0);
		
		ArrayList<SinhVien> list = new ArrayList<>();
		for (int i = 0; i < a.getN(); i++) {
			SinhVien sv = new SinhVien();
			sc.nextLine();
			sv.Input();
			System.out.print("Enter student id: ");
			sv.setIdStudent(sc.nextLine());
			System.out.print("Enter major: ");
			sv.setMajor(sc.nextLine());
			System.out.print("Enter year: ");
			sv.setYear(sc.nextInt());
			list.add(sv);
		}
		sc.nextLine();
		System.out.print("Enter teacher: ");
		a.setTeacher(sc.nextLine());
		
		System.out.println("\n---------Information of class---------");
		System.out.println("Ma lop: " + a.getIdClass());
		System.out.println("Ten lop hoc: " + a.getNameClass());
		System.out.println("Ngay mo: " + a.getDayOpen());
		System.out.println("\n---------Information students---------");
		for (int i = 0; i < a.getN(); i++) {
			list.get(i).Output();
			System.out.println("Ma sv: " + list.get(i).getIdStudent());
			System.out.println("Nganh: " + list.get(i).getMajor());
			System.out.println("Khoa hoc: " + list.get(i).getYear());
			System.out.println("");
		}
		
		Count(a);
	}
	
	
	public static void Count(LopHoc a) {
		int count = 0;
		for (SinhVien sv : a.getX()) {
			if (sv.getYear() == 15) {
				count ++;
			}
		}
		
		if (count == 0) {
			System.out.println("Khong co sinh vien khoa 15");
		} else {
			System.out.println("Co " + count + " sinh vien khoa 15");
		}
	}
	
	
	
}
