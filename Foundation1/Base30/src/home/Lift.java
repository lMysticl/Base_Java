/*Задача Лифт
(Lift и MainLift).
Будем считать, что все люди в дом попадают только через лифт, убывают тем же способом.
В доме есть лестница(не попадающая на 1 этаж), которой могут пользоваться люди в доме.
Поля объекта Lift не менять напрямую.(только через метод)
На первом этаже тех этаж(тут люди не живут).
Поля: 
 - текущий этаж curFloor
 - общее количество этажей перемещения countFloat
 - общее количество перевезенных людей countPeople
 - количество людей находящихся в данный момент в доме. currentCountPeople
У лифта методы: 
    - метод перемещения лифта с номером этажа для перемещения nextFloor и количеством человек countHuman: 
  move(int nextFloor, int countHuman)
 - метод выводящий состояние лифта(значение всех полей объекта): printAboutMe()
В главном классе создать объект лифта, и вызвать 10 раз метод move (с рандомными значениями) и после каждого 
перемещения вызываем метод printAboutMe.*/
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
		System.out.println("Текущий этаж: " + curFloor);
		System.out.println("Количество пройденых этажей: " + countFloat);
		System.out.println("Количество перевезенных людей:" + countPeople);
		System.out
				.println("Количество людей находящихся в данный момент в доме:"
						+ this.currentCountPeople + "\n *****************");

	}
}
