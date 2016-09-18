package home;

public class MainProgrammer {

	public static void main(String[] args) {

		Programmer1 programmer1 = new Programmer1();
		// programmer1.printAboutMe();
		Programmer2 programmer2 = new Programmer2();
		// programmer2.printAboutMe();
		Programmer3 programmer3 = new Programmer3();
		// programmer3.printAboutMe();
		System.out.println(programmer1.weather1);
		System.out.println(programmer2.weather1);
		System.out.println(programmer3.weather1);
		if (programmer1.weather1 > programmer2.weather1
				& programmer1.weather1 > programmer3.weather1) {
			System.out.println("Больше зараб прог 1 = " + programmer1.weather1);
		} else if (programmer2.weather1 > programmer2.weather1
				& programmer2.weather1 > programmer3.weather1) {
			System.out.println("Больше зараб прог 2 = " + programmer2.weather1);

		} else {System.out.println("Больше зараб прог 3 = " + programmer3.weather1);
		}
	}
}
