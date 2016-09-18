package home;

public class Programmer3 {

	int rain = 1;
	int sun = 2;
	int dry = 3;
	int time = 9;
	int income3 ;
	int weather1;
	int weather2;
	int weather3;
	int earns =35;
	public Programmer3() {
	//	if (weather == 1) {
			this.time = time - 2;
			income3 = earns * this.time;
			weather1=this.income3;

	//	} else if (weather == 2) {
			this.time = time - 1 / 2;
			income3 = earns * this.time;
			weather2 = this.income3;

	//	} else if (weather == 3) {
			this.time = time - 1;
			income3 = earns * this.time;
			weather3 = this.income3;
	//	}

	}

	public void printAboutMe() {
		System.out.println("Третий програмист заработает: " + income3);

	}
}
