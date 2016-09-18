package week3.Lesson6;

public class IPhone5 extends IPhone {

	public IPhone5(String number, boolean camera, int sideSize, int appleId) {
		super(number, camera, sideSize, appleId);
		
	}

	@Override
	public String printModel() {
		return "IPhone5";
	}

}
