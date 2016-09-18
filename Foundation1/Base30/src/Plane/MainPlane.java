package Plane;



public class MainPlane {
	public static void main(String[] args) {
		Plane boeing747 = new Plane();
//		boeing747.printRoute();
//		boeing747.takeoff();
		Wing boeing = new Wing();
		boeing.takeoff();
	
	}
}
