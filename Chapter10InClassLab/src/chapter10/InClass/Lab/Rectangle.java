package chapter10.InClass.Lab;

public class Rectangle implements Shape {

	private double length, width;
	
	public Rectangle(double len, double width){
		if(len<0){
			throw new IllegalArgumentException(String.format("%d is a negative number. Length must be positive", len));
		}else{
			this.length = len;
		}
		if(width < 0){
			throw new IllegalArgumentException(String.format("%d is a negative number. Width must be positive", width));
		}else{
		this.width = width;
		}
	}
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public double getArea() {
		return length * width;
	}
	
	public String toString(){
		return format.format(getArea());
	}

}
