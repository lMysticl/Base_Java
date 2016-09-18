package home;
import java.util.Scanner;
public class Fourth {
	public static void main (String[] args) 
	{Scanner scan = new Scanner(System.in);
		System.out.print("");
		int choseNum1 = scan.nextInt();
		System.out.print("");
		int choseNum2 = scan.nextInt();
			if (choseNum1>0 & choseNum2>0){
			System.out.print(""+1);}
			else if (choseNum1<0 & choseNum2>0){
				System.out.print(""+2);}
			else if (choseNum1<0 & choseNum2<0){
				System.out.print(""+3);
			}
			else if (choseNum1>0 & choseNum2<0){
				System.out.print(""+4);
			}
			else if (choseNum1==0 | choseNum2==0){
				System.out.print(""+0);
			}
			scan.close();
		}
   
}
/*100
	Задание выполнено
	Код решения: fCoFlP/3LarE/lp/+ip+AKkwZbs=*/