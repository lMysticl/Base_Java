package lesson05;

import java.util.Arrays;

public class Task03 {

	public static void main(String[] args) {
		int[][] array = randomMatrix(5,5);
		printMatrix(array);
		System.out.println(array[1][3]+array[0][4]);
	}
	public static int[][] randomMatrix(int heigth,int width){
		int[][] array = new int [heigth][width];
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			array[i][j] = (int) (Math.random()*10);
		}}
		return array;}
	public static void printMatrix(int[][] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));}}
	
}
