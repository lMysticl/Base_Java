/*������ ����
(Lift � MainLift).
����� �������, ��� ��� ���� � ��� �������� ������ ����� ����, ������� ��� �� ��������.
� ���� ���� ��������(�� ���������� �� 1 ����), ������� ����� ������������ ���� � ����.
���� ������� Lift �� ������ ��������.(������ ����� �����)
�� ������ ����� ��� ����(��� ���� �� �����).
����: 
 - ������� ���� curFloor
 - ����� ���������� ������ ����������� countFloat
 - ����� ���������� ������������ ����� countPeople
 - ���������� ����� ����������� � ������ ������ � ����. currentCountPeople
� ����� ������: 
    - ����� ����������� ����� � ������� ����� ��� ����������� nextFloor � ����������� ������� countHuman: 
  move(int nextFloor, int countHuman)
 - ����� ��������� ��������� �����(�������� ���� ����� �������): printAboutMe()
� ������� ������ ������� ������ �����, � ������� 10 ��� ����� move (� ���������� ����������) � ����� ������� 
����������� �������� ����� printAboutMe.*/
package home;

public class Lift {
	int curFloor = 0;
	int countFloat = 0;
	int countPeople = 0;
	// int nextFloor = 0;
	int currentCountPeople = 0;

	public Lift() {
		// this.countPeople += countPeople;
		// this.curFloor += curFloor;
		// this.countFloat += countFloat;
		// this.currentCountPeople += currentCountPeople;
	}

	public void move(int nextFloor, int countHuman) {
		if (nextFloor == 0) {
			currentCountPeople -= countHuman;
			if (nextFloor > curFloor) {
				countFloat += nextFloor - curFloor;
				countPeople += countHuman;				
			} else {
				countFloat += curFloor - nextFloor;
				countPeople += countHuman;
			}
		} else {
			if (curFloor == 0)
				currentCountPeople += countHuman;
			if (nextFloor > curFloor) {
				countFloat += nextFloor - curFloor;
				countPeople += countHuman;
			} else {
				countFloat += curFloor - nextFloor;
				countPeople += countHuman;
			}
		}
		curFloor = nextFloor;
		// if (nextFloor != curFloor)
		// countPeople += countHuman;
		// curFloor += nextFloor;
		// currentCountPeople += countPeople;
	}

	public void printAboutMe() {
		System.out.println("������� ����: " + curFloor);
		System.out.println("���������� ��������� ������: " + countFloat);
		System.out.println("���������� ������������ �����:" + countPeople);
		System.out
				.println("���������� ����� ����������� � ������ ������ � ����:"
						+ this.currentCountPeople + "\n *****************");

	}
}
