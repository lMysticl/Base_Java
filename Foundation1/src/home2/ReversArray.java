package home2;

import java.util.Arrays;

public class ReversArray {
	 public static void main(String[] args) {
	  int[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
	  revertVector(vector);
	  
	 }
	 
	 public static void revertVector(int[] vector)
	 {
		 if(vector.length<=0) {System.out.println("Неверный размер вектора");}
		 else {	int k = 0;
		 
			 for (int i = 0; i < vector.length/2; i++) { 
				 
				 int temp = vector[k];
				  vector[k] = vector[vector.length-i-1];
				  vector[vector.length-i-1] = temp;
				  k++; 
	   } 
	   System.out.println(Arrays.toString(vector));  }
	 }
	}
//100
//Задание выполнено
//Код решения: aELLmNUOVDnhrjjjv8GfUHW7U9Q=

