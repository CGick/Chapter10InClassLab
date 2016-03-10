package chapter10.InClass.Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ShapesRead {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("shapes.dat");
		ObjectInputStream input = new ObjectInputStream(fis);
		
		Shape[] shapesData = new Shape[5];
		
		for(int i = 0; i < shapesData.length; i++){
			try {
				shapesData[i] = (Shape)input.readObject();
			} catch (ClassNotFoundException e) {
				System.err.println("Tried to read a shape but that class does not exist!");
				e.printStackTrace();
			}
			
		}
		input.close();
		for(int i = 0; i <shapesData.length; i++){
			System.out.println(shapesData[i]);
		}
	}

}
