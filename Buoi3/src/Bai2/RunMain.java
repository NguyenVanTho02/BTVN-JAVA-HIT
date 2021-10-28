package Bai2;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Array arr1 = new Array();
		Array arr2 = new Array();
		
		System.out.println("------ Enter array data 1 -------");
		arr1.InputData();
		arr1.Show();
		System.out.println("\nSum = " + arr1.Sum());
		System.out.print("Enter flag: ");
		Boolean flag1 = sc.nextBoolean();
		arr1.Filter(flag1);
		
		System.out.println("");
		
		System.out.println("------ Enter array data 2 -------");
		arr2.InputData();
		arr2.Show();
		System.out.println("\nSum = " + arr2.Sum());
		System.out.print("Enter flag: ");
		Boolean flag2 = sc.nextBoolean();
		arr1.Filter(flag2);
		
		double TB1 = (double)arr1.Sum()/arr1.getN();
		double TB2 = (double)arr2.Sum()/arr2.getN();
		
		if (TB1 > TB2) {
			System.out.println("\nArray 1");
		} else if (TB1 < TB2) {
			System.out.println("\nArray2");
		} else {
			System.out.println("\nBye");
		}
		
	}
}
