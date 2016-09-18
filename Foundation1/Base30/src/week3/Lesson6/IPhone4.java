package week3.Lesson6;

public class IPhone4 extends IPhone{

	public IPhone4(String number, boolean camera, int sideSize, int appleId) {
		super(number, camera, sideSize, appleId);
		
	}

	@Override
	public String printModel() {
		return "Iphone 4";
	}

}
