package lesson01;

public class Task02 {
	public static void main (String[] args){
		int a = 10 , b = 15, c;
		c = a + b * a;
		System.out.println("C = " + c);
		//c = c + b;
		c =c + b;//-= *= /=
		System.out.println("C = " + c);
		//++ --
		int d = 25 , e = 25;
		System.out.println("Sum = " + (d +e++));
				System.out.println("E =" + e);
	}

}
