package Bai2;


import java.util.Scanner;

public class RunMain {
	
	static int n;
	static int[] a;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choose;
		do {

			System.out.print("\nYour choose: ");
			choose = sc.nextInt();	
		
			switch (choose) {
			case 1:
				Input();
				break;
			case 2:
				Output();
				break;
			case 3:
				Insert();
				break;
			case 4:
				Delete();
				break;
			case 5:
				Reverse();
				break;
			case 6:
				showElement();
				break;
			case 7:
				sumPrime();
				break;
			case 8:
				break;
			} 
		} while (choose < 9);
		
	}
	
	public static void Input() {
		System.out.print("Enter n:  ");
		do {
			n = sc.nextInt();
		} while (n <= 0);
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
	}
	
	public static void Output() {
		System.out.print("The array is inputed: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("");
	}
	
	public static void Insert() {
		System.out.print("Enter the number to insert:  ");
		int k = sc.nextInt();
		System.out.print("Enter location to insert: ");
		int pos = sc.nextInt();
		int j = 0;
		int tempIndex = a.length + 1;
		int[] b = new int[tempIndex];
		
		for (int i = 0; i < tempIndex; i++) {
			if (i == pos - 1) {
				b[i] = k;
			} else {
				b[i] = a[j];
				j++;
			}
		}
		
		for (int m : b) {
			System.out.print(m + "  ");
		}
		System.out.println("");
	}
	
	public static void Delete() {
		System.out.println("Enter location to delete: ");
		int pos;
		do {
		pos = sc.nextInt();
		} while (pos <= 0 || pos > n);
	
	
		for (int i = pos - 1; i < n-1; i++) {
			a[i] = a[i+1];
		}
		n--;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("");
	}
	
	public static void Reverse() {
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("");
	}
	
	public static void showElement() {
		System.out.println("a[1] = " + a[1]);
		System.out.println("Elements is divisible by a[1]: ");
		for (int i = 0; i < n; i++) {
			if (a[i] % a[1] == 0 ) {
				System.out.print(a[i] + "  ");
			}
		}
		System.out.println("");
	}
	
	public static boolean isPrime(int k) {
		if (k < 2)	return false;
		for (int i = 2; i*i <= k; i++) {
			if (k % i == 0)	
				return false;
		}
		return true;
	}
	
	public static void sumPrime() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i]))
				sum += a[i];
		}
		System.out.println("Sum = " + sum);
	}
	
	
	
	
}