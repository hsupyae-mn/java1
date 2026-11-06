
public class Exr9_1{
public static void main(String[]args){
	Rectangle rectangle = new Rectangle();
	System.out.println("The area of the rectangle of"+
			rectangle.width+"and"+rectangle.height+"is"+rectangle.getArea());	
	System.out.println("The perimeter of the rectangle of"+
					rectangle.width+"and"+rectangle.height+"is"+rectangle.getPerimeter());
			
	
	Rectangle rectangle1= new Rectangle(4,40);
	System.out.println("The area of the rectangle of"+
	        rectangle1.width+"and"+rectangle1.height+"is"+rectangle1.getArea());	
	System.out.println("The perimeter of the rectangle of"+
			rectangle1.width+"and"+rectangle1.height+"is"+rectangle1.getPerimeter());
	
	Rectangle rectangle2= new Rectangle(3.5,35.9);
	System.out.println("The area of the rectangle of"+
			rectangle2.width+"and"+rectangle2.height+"is"+rectangle2.getArea());
	System.out.println("The perimeter of the rectangle of"+
			rectangle2.width+"and"+rectangle2.height+"is"+rectangle2.getPerimeter());
}
	
		
}

class Rectangle{
	double width,height;
	
	Rectangle(){
		width=1;
		height=1;
	}
	Rectangle(double newWidth,double newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	double getArea(){
		return width*height;
	}
	
	double getPerimeter(){
		return 2*(width+height);
	}
}


