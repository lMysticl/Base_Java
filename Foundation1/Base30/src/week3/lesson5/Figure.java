package week3.lesson5;

public abstract class Figure {
	private double xPos;
	private double yPos;
	private double sideA;
	public double getPerim(){
		return 0;
	}
	public abstract double getSquare();
	
	public double getSideA(){
		return sideA;
	}
	public Figure(double x,double y,double a){
		xPos=x;
		yPos=y;
		sideA=a;
		
	}
	

}
