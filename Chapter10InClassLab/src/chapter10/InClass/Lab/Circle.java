package chapter10.InClass.Lab;

public class Circle implements Shape {

	private double radius;
	
	public Circle(double rad){
		if(rad < 0){
			throw new IllegalArgumentException(String.format("%d is a negative number. Radius must be positive", rad));
		}else{
			this.radius = rad;
		}
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString(){
		return format.format(getArea());
	}
}
