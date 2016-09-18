package home2;

import java.util.Scanner;

public class RandomMassiv {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("");
		int a = scan.nextInt();
		int array[] = new int[a];
		for (int count = 0; count < a; count++) {
			array[count] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}