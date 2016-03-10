package chapter10.InClass.Lab;

import java.io.Serializable;
import java.text.DecimalFormat;

public interface Shape extends Serializable{

	DecimalFormat format = new DecimalFormat("#,##0.00");
	double getArea();
}
