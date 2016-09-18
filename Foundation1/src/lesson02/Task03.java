package lesson02;

public class Task03 
//Голобальное
{
 public static void main (String[] args){
	 
	 int a=10; int b =10;
	//Не ленивая
	 if (a==11 & b++ == 10){}
	 System.out.println(a+ " " + b);
	 //Ленивая
	 if (a==11 && b++ == 10){}
	 System.out.println(a+ " " + b);
	 
	 int c =25 , d =30;
	 
	 if (c > d) //Начало локалькольно если улосвие не выполняется тогда Не выполнится
	 {
		 System.out.println("Не выполнится");}
	 }
 }

