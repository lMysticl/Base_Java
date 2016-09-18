package week3.Lesson6;

public class Nokia extends Phone {

	public Nokia(String number, boolean camera, int sideSize) {
		super(number, camera, sideSize);

	}

	@Override
	public String printModel() {
		return "Nokia";
	}

}
