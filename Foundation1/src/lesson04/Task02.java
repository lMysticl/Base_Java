package lesson04;

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {

		int a = 5;
		print(a);
		System.out.println("CLASS A = " + a);

		Double b = new Double(5.0);
		print(b);
		System.out.println("CLASS B = " + b);

		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(array));
		randomArray(array);
		System.out.println(Arrays.toString(array));
	}

	public static void print(int a) {
		a = a + 10;
		System.out.println("METHOD A = " + a);
	}

	public static void print(Double b) {
		b = b + 10.25;
		System.out.println("METHOD B = " + b);
	}

	public static void randomArray(int[] array) {
		for (int i = 0; i < 5; i++) {
			array[i] = (int) (Math.random() * 10);
		}
	}
}