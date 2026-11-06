
public class SimpleTriangle {
	public static void main(String[]args){
		 Triangle triangle=new Triangle();
		double side1,side2, side3;
		System.out.println("A trigle with sides"+ triangle.getSide1()+triangle.getSide2()+triangle.getSide3());
		System.out.println("The color is"+triangle.getColor());
		System.out.println("The area is"+triangle.getArea());
		System.out.println("The Perimeter is"+triangle.getPerimetre()); 
		System.out.println("The triangle is created"+triangle.getDateCreated());
		System.out.println("The trigle is "+triangle.isFilled());
	}

	
}
