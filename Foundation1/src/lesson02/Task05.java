package lesson02;
import java.util.Scanner;
public class Task05 {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("1.Сложение\n2.Вычитание\n3.Умножкние\n4.Деление\n ");
		System.out.print("Видите операцию (1-4): ");
		int choice = 0;
			if (scan.hasNextInt()){
				 choice = scan.nextInt();
		    if (choice >= 1 & choice <= 4){
		    	
		    }else{System.out.print("Ошибка! Выбора операции ");
			
			}
				
			}//Проверка веденно ли число
		else {System.out.print("Ошибка! Веденнно не коректное значение ");
		}
//			if (choice == 1) {
//				System.out.print("Видите число A ");
//				int a = scan.nextInt();
//				System.out.print("Видите число B ");
//				int b = scan.nextInt();
//				int c;
//				c = a + b;
//				System.out.print("C = " + c);
			if (choice >= 1 & choice >= 1){
				System.out.print("Видите число A и B");
				int a = scan.nextInt();
				int b = scan.nextInt();
					if (choice == 1) {
					System.out.println(" A + B= "+ (a + b));} 
				else if (choice == 2) {
					System.out.println("A - B= " + (a - b));}
				else if (choice == 3) {
					System.out.println("A * B= "+ (a * b));}
				else if (choice == 4) {
					System.out.println("A / B= "+ (a / b));}
			}
//			swich (choice) {
//				case 1:{System.out.println(" A + B= "+ (a + b));
//				
//				break;}
//				case 2:{System.out.println("A - B= " + (a - b));
//					break;}
//				case 3:{System.out.println("A * B= "+ (a * b));
//					
//					break;}
//				
//				case 4 {System.out.println("A / B= "+ (a / b));
//					break;}
//				default{
//				System.out.print("Ошибка! Веденнно не коректное значение ");
//				}		
	}


}
