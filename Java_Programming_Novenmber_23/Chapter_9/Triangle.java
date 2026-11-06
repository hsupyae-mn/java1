
public class Triangle 
		extends GeometricObject{
		private double side1=0.1;
		private double side2=0.1;
		private double side3=0.1;
		
	
public Triangle(double side1, double side2, double side3){
	this.side1=side1;
	this.side2=side2;
	this.side3=side3;
	getArea();
	getPerimetre();
	toString();
    
}

public Triangle() {
	// TODO Auto-generated constructor stub
}

public double getSide1(){
	return side1;
}
public double getSide2(){
	return side2;
}
public double getSide3(){
	return side3;
}
 
public double getArea(){
	double s = (side1 + side2 + side3)/2;
	double area = 2*s*(s - side1)*(s - side2)*(s - side3);
 return area;
}

public double getPerimetre(){
	return side1+side2+side3;
}

public String toString(){
	return "Triangle:side1= " +side1+"side2="+side2+ "side3="+side3;
}


}

