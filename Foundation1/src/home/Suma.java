package home;
import java.util.Scanner;
public class Suma {
	public static void main(String[] args){
	int n;
    int sum = 0;
    System.out.print("Bвод натурального числа - ");
    Scanner sr = new Scanner(System.in);
    n = sr.nextInt();
    while(n == 0){
       //Суммирование цифр числа
        sum = sum + (n % 10);
     System.out.println(sum + " ");
   }
    sr.close();}
}

