package home2;

public class Average {

	public static void main(String[] args) {
		
	}
	public static int calcVectorAvg(int[] vector){
		
		int sum=0,sumArf=0,count=0;
	
		if(vector.length > 0){
			
			  for (int i = 0; i < vector.length; i++) {
				  sum+=vector[i];
				  
				  count++;}sumArf=sum/count;
			 }
		else{System.out.println("Неверный размер вектора");}
		return sumArf; }  

}
//100
//Задание выполнено
//Код решения: Q9Mc6QhsSgpGOxD5tCeRVQ9hAtc=