package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		
		LopHoc a = new LopHoc();
		Input(a);
		Output(a);
		Count(a);
		Sort(a);
		Output(a);
	}
	
	public static void Input (LopHoc a) {
		Scanner sc = new Scanner(System.in);
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
			a.x.add(sv);
		}
		sc.nextLine();
		System.out.print("Enter teacher: ");
		a.setTeacher(sc.nextLine());
	}
	
	public static void Output (LopHoc a) {
		System.out.println("\n---------Information of class---------");
		System.out.println("Ma lop: " + a.getIdClass());
		System.out.println("Ten lop hoc: " + a.getNameClass());
		System.out.println("Ngay mo: " + a.getDayOpen());
		System.out.println("\n---------Information students---------");
		for (int i = 0; i < a.getN(); i++) {
			a.x.get(i).Output();
			System.out.println("Ma sv: " + a.x.get(i).getIdStudent());
			System.out.println("Nganh: " + a.x.get(i).getMajor());
			System.out.println("Khoa hoc: " + a.x.get(i).getYear());
			System.out.println("");
		}
	}
	
	
	public static void Count (LopHoc a) {
		int count = 0;
		for (int i = 0; i < a.getN(); i++) {
			if (a.getX().get(i).getYear() == 15) {
				count ++;
			}
		}
		
		if (count == 0) {
			System.out.println("Khong co sin vien khoa 15");
		} else {
			System.out.println("Co " + count + " sinh vien khoa 15");
		}
	}
	
	public static void Sort (LopHoc a) {
		for (int i = 0; i < a.getN()-1; i++) {
			for (int j = i+1; j < a.getN(); j++) {
				if(a.getX().get(i).getYear() > a.getX().get(j).getYear()){
					Collections.swap(a.getX(), i, j);
				}
			}
		}
	}	
}
