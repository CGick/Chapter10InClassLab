package chapter10.InClass.Lab;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ShapesWrite {

	public static void main(String[] args){
		FileOutputStream fos = new FileOutputStream("shapes.dat", true);
		ObjectOutputStream output = new ObjectOutputStream(fos);
		
		for(int i = 0; i<=4; i++){
			Circle c = new Circle(i * 2);
            output.writeObject(c);
		}
		
		output.close();
	}

}
