package lesson05;

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
	int[][] array = new int[5][];
	randomMatrix(array);
	printMatrix(array);

	}
	public static void randomMatrix(int [][] array){
		for (int i = 0; i < array.length; i++) {
			int[] vector = new int [(int)(Math.random()*10)];
			for (int j = 0; j < vector.length; j++) {
				vector[j] = (int)(Math.random()*10);
			}
			array[i] = vector;
		}
	}
	public static void printMatrix(int[][] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
			for (int j = 0; j < array[i].length; j++) {		
		}		
		}
	}
	
}
