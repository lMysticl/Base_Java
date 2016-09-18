package home;
import java.util.Scanner;
public class Even {
	public static  void main(String[] args){
		Scanner inputNum1 = new Scanner(System.in);
		int num1 = inputNum1.nextInt();
		if (num1%2==0)
		{
			System.out.println("четное");
		}
		else if (num1%2>0){
			System.out.println("нечетное");
		}	
		
		inputNum1.close();}
}
//100
//Задание выполнено
//Код решения: AzS7RtxhRD7QbIZ9lxizLFnh7xw=