/*
 * */
package home;

public class Programmer1 {
	int rain = 1;
	int sun = 2;
	int dry = 3;
	int earns =35;
	int time=9;
	int income1;
	int weather1;
	int weather2;
	int weather3;
	public Programmer1() {
		//if (weather == 1) {
			this.time = time - 2;
			this.income1 = earns * this.time;
			this.income1 -= 80;
			weather1=this.income1;
	//	} else if (weather == 2) {
			this.time = time - 1 / 2;
			this.income1 = earns * this.time;
			this.income1 -= 80;
			weather2=this.income1;
		//} else if (weather == 3) {
			this.time = time - 1;
			this.income1 = earns * this.time;
			this.income1 -= 80;
			weather3=this.income1;
		//}

	}

	public void printAboutMe() {
		System.out.println("Первый програмист заработает: " + this.income1);
		

	}

}
