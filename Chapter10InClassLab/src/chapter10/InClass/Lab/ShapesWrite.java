package chapter10.InClass.Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ShapesWrite {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("shapes.dat", true);
		ObjectOutputStream output = new ObjectOutputStream(fos);
		Scanner kb = new Scanner(System.in);
		String ans;
		
		do{
			System.out.println("What is your shape?");
			ans = kb.nextLine();
			
			switch(ans){
		
				case "Circle":{
					System.out.println("What is your radius?");
					double radius = kb.nextDouble();
					kb.nextLine();
					Circle c = new Circle(radius);
					System.out.println("Area: " + c.toString());
					output.writeObject(c);
					break;
				}
				case "Square":{
					System.out.println("What is your length?");
					double length = kb.nextDouble();
					kb.nextLine();
					Square s = new Square(length);
					System.out.println("Area: " + s.toString());
					output.writeObject(s);
					break;
				}
				case "Rectangle":{
					System.out.println("What is your width?");
					double width = kb.nextDouble();
					kb.nextLine();
					System.out.println("What is your length?");
					double length = kb.nextDouble();
					kb.nextLine();
					Rectangle r = new Rectangle(length, width);
					System.out.println("Area: " + r.toString());
					output.writeObject(r);
					break;
				}
			}
			System.out.println("Do you have more shapes? Answer Yes or No.");
			ans = kb.nextLine();
		}
		while(!ans.equalsIgnoreCase("no"));
		
		output.close();
	}

}
