package home;

import java.util.Scanner;

public class Hight_year {

	public static  void main(String[] args) {
		Scanner importScanner = new Scanner(System.in);
		int num1 = importScanner.nextInt();
		if (num1%4==0 && num1%100!=0){
			System.out.println(""+num1);
			System.out.println("Високосный");
		}
		else if (num1%400==0) {	
			System.out.println(""+num1);
			System.out.println("Високосный");
			}
		else{
			System.out.println("Невисокосный");
		}
		importScanner.close();}
}
//100
//Задание выполнено
//Код решения: qMB/dD6Tr5LkxcaZciIJHAkGIzc=

