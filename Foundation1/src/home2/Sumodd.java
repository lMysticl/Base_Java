package home2;

public class Sumodd {

	public static void main(String[] args) {
		 int[] vector = { 6, 5, 4, 2, 7, 4, 5, 2, 4, 5, 3};
		  System.out.println(calcNonPairCount(vector));
	}
	public static int calcNonPairCount(int[] vector){
		
		int sum = 0;
		if(vector.length > 0){
			
			  for (int i = 0; i < vector.length; i++) {
			  
			   if (vector[i] % 2 == 0) {
			    
			   }
			   else if (vector[i] % 2 != 0){sum ++;}
			   }
			}
		else{System.out.println("Неверный размер вектора");}
		 return sum;} 
}
//
//100
//Задание выполнено
//Код решения: PFOwkdimbodwvGM324n4hspD/14=