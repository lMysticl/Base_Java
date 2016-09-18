package week5.lesson10;

public class Recursia {
public static void main(String[] args) {
	  f(10);
	 }
	 public static void f(int k){
	  System.out.println( k );
	  if(k>2) f(k-1);  
}
}
