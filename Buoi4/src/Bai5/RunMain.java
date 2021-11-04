package Bai5;

public class RunMain {
	
	public static boolean isPrime(int n) {
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}
	
	public static boolean isPrime(long n) {
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}
	
	public static boolean isPrime(float n) {
		return false;
	}
	
	public static boolean isPrime(double n) {
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPrime(123457));
		System.out.println(isPrime(4.5f));
		System.out.println(isPrime(6.88));
	}
}
