package home;

public class MainLift {
	public static void main(String[] args) {
		Lift Otis = new Lift();
		for (int i = 0; i < 10; i++) {
			Otis.move(((int) Math.random() * 10), ((int) Math.random() * 10));
			Otis.printAboutMe();
		}
	}

}
