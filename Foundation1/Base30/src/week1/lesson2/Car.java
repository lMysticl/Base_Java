package week1.lesson2;

public class Car {
	private String color;
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		if(c.equals("Black")||c.equals("White")||c.equals("Green"))
		color = c;
	}
	public void printAboutMe(){
		System.out.println(color);
	}
	}