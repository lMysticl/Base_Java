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
				System.out.println("�� ���� �����, ��� ��� ��� ����");
			}

		}

		public void down() {

			if (isup == true & isdown == false){
				isup = false;
				isdown = true;
				}
	
			else
			{
				System.out.println("� �� ���� ��������, ��� ��� ��� � �������");
			}
		}

		public void printAboutMe() {
			if (isup == true & isdown == false) {
				System.out.println("� �������");
			} 
			else if (isdown == true & isup == false) {
				System.out.println("� ���");
			}
		}
	}

