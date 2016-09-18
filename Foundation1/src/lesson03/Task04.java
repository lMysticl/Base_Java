package lesson03;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		int array[] = new int[10];
		for (int count = 0; count < 10; count++) {
			array[count] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(array));
	}
}
