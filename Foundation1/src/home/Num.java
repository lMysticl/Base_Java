package home;
import java.util.Scanner;
public class Num {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Ведите семи значное число: =");
	int num = scan.nextInt();
	int	num1 =num%10;num/=10;//1
	int num2 =num%10;num/=10;//2
	int	num3 =num%10;num/=10;//3
	int	num4 =num%10;num/=10;//4
	int	num5 =num%10;num/=10;//5
	int	num6 =num%10;num/=10;//6
    int num7 =num%10;num/=10;//6
	int sumNar =(num1+num2+num3+num4+num5+num6+num7)/7;
		System.out.println(""+ sumNar );
	scan.close();	
	}
}
