package Bai1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[]agrs) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.print("Nhap m: ");
		m = sc.nextInt();
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == m-1 || j == 0 || j == n-1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
