package home2;

public class ChangeMinMax {
	public static void main(String[] args) {
	int[] vector1 = { 8, 5, 1, 6, 4 , 8, 4, 3};
		swapMaxMinVector(vector1);
}

public static  void swapMaxMinVector(int[] vector) {
	 if(vector.length<=0) {System.out.println("Неверный размер вектора");}
	 else{
	int maxIndex = 0;
    int minIndex = 0;
    for (int i = 0; i < vector.length; i++) {
     if (vector[i] > vector[maxIndex])
      maxIndex = i;
     if (vector[i] < vector[minIndex])
      minIndex = i;
    }
    int temp = vector[maxIndex];
    vector[maxIndex] = vector[minIndex];
    vector[minIndex] = temp;
    System.out.print("[");
    for (int i = 0; i < vector.length-1; i++) {
         System.out.print( vector[i]+", ");}
    System.out.print(vector[vector.length-1]+"]");
	 }
	} 
	

	}
//
//100
//Задание выполнено
//Код решения: EXWYTJeHtUzcrLxSmbMFvKi6NPs=
