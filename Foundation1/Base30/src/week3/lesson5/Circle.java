package week3.lesson5;

public class Circle extends Figure {
	public Circle(double x, double y, double a) {
		super(x, y, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSquare(){
		return 	Math.PI*getSideA()*getSideA();
	}
}
