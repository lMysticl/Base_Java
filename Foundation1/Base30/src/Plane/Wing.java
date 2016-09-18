package Plane;

import java.util.Scanner;

public class Wing {
	public int fuel;
	Scanner scan = new Scanner(System.in);
	public void takeoff(){
		
		
		System.out.println("Ведите количество топливо");
		fuel = scan.nextInt();
		
		
		
		if(fuel<=50){fuel=scan.nextInt();
		System.out.println("Ведите количество топливо");}
		else System.out.println("Взлетаем");
		scan.close();
		
	}
	public  void selectRoute(int[][] coordinates){
		
	}
	public void printRoute(){
		
	}
}
