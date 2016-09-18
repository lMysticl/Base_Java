package session_home;

public class Fact {

	public static void main(String[] args) {
		
		System.out.println(fact(3));
	}
	public static long fact(long num) {
	     if (num == 0)
			return 1;
		else
			return num * fact(num - 1);
	}
	}
