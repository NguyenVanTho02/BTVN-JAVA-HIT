package Bai2;

import java.util.Scanner;

public class Array {
	
	Scanner sc = new Scanner(System.in);
	
	private int n;
	private int[] a;
	
	public void InputData() {
		System.out.print("Enter n: ");
		n = sc.nextInt();
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
	}
	
	public void Show() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	public int Sum() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public void Filter(Boolean flag) {
		if (flag == true) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					System.out.print(a[i] + "\t");
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 1) {
					System.out.print(a[i] + "\t");
				}
			}
		}
	}
	
	public Array() {
		
	}
	
	public Array(int n, int[] a) {
		this.n = n;
		this.a = a;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setArray (int[] a) {
		this.a = a;
	}
	
	public int getN() {
		return n;
	}
	
	public int[] getArray() {
		return a;
	}
	
}
