package home2;

import java.util.Arrays;

public class PalindromMas {
	public static void main(String[] args) {
		int[] vector1 = { 1, 2, 3, 4, 4 , 3, 2, 1 };
		isVectorPalindrom(vector1);
	}

	public static  boolean isVectorPalindrom(int[] vector) {
		int varA =1;
			if ((vector[vector.length/2-varA]==vector[vector.length/2+varA])) {
			for (int idx = 0; idx < 1; idx++) {
				System.out.println(Arrays.toString(vector));
				}varA--;return true;
		} 
		else if ((vector[vector.length/2]==vector[(vector.length/2)-varA])) {
			for (int idx = 0; idx < 1; idx++) {
				varA--;}return true;
				}
		else{System.out.println("Не полиндром");	return false;
		}
	}
	}
//100
//Задание выполнено
//Код решения: PDUJyjRCJQjPZ69UJnpTZfxCAEU=
