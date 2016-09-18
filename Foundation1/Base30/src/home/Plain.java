package home;

public class Plain {
	
		boolean isup = false;
		boolean isdown = true;

		public Plain() {
		}

		public void up() {
			if (isup == false & isdown == false){
				isup = true;
				isdown = false;
			}
		
			else {
				System.out.println("не могу сесть, так как уже сижу");
			}

		}

		public void down() {

			if (isup == true & isdown == false){
				isup = false;
				isdown = true;
				}
	
			else
			{
				System.out.println("я не могу взлететь, так как уже в воздухе");
			}
		}

		public void printAboutMe() {
			if (isup == true & isdown == false) {
				System.out.println("я взлетел");
			} 
			else if (isdown == true & isup == false) {
				System.out.println("я сел");
			}
		}
	}

