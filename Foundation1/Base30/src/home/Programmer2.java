package home;

public class Programmer2 {
	int rain = 1;
	int sun = 2;
	int dry = 3;
	int time=9;
	int income2 = 0;
	int weather1;
	int weather2;
	int weather3;
	int earns =35;
	public Programmer2() {
		//if (weather == 1) {
			this.time = time - 4;
			this.income2 = earns * this.time;
			this.income2 -= 20;
			weather1 = this.income2;
		//} else if (weather == 2) {
			this.time = time - 1;
			this.income2 = earns * this.time;
			this.income2 -= 20;
			weather2 = this.income2;
		//} else if (weather == 3) {
			this.time = time - 2;
			this.income2 = earns * this.time;
			this.income2 -= 20;
			weather3 = this.income2;

		//}

	}

	public void printAboutMe() {
		System.out.println("Второй програмист заработает: " + this.income2);

	}

}
