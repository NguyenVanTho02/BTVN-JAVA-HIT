package Bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Sum<Integer> sumInteger = new Sum(1,1);
        Sum<Long> sumLong = new Sum<Long>(333L, 9999L);
        Sum<Float> sumFloat = new Sum(1.2f, 3.4f);
        Sum<Double> sumDouble = new Sum<Double>(1.234, 5.678);

        System.out.println("Sum Integer: " + (sumInteger.getA() + sumInteger.getB()));
        System.out.println("Sum Long: " + (sumLong.getA() + sumLong.getB()));
        System.out.println("Sum Float: " + (sumFloat.getA() + sumFloat.getB()));
        System.out.println("Sum Double: " + (sumDouble.getA() + sumDouble.getB()));
    }
}