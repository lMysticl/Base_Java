package Plane;

import java.util.Scanner;

public class Wing {
	public int fuel;
	Scanner scan = new Scanner(System.in);
	public void takeoff(){
		
		
		System.out.println("������ ���������� �������");
		fuel = scan.nextInt();
		
		
		
		if(fuel<=50){fuel=scan.nextInt();
		System.out.println("������ ���������� �������");}
		else System.out.println("��������");
		scan.close();
		
	}
	public  void selectRoute(int[][] coordinates){
		
	}
	public void printRoute(){
		
	}
}
