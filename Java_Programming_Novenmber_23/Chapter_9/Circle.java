
	public class Circle {
		 private double radius;
		 
		 public Circle(double radius) {
		radius = radius;
		 }
		 
		 public double getRadius() {
		 return radius;
		}
		
		 public double getArea() {
		 return radius * radius * Math.PI;
		 }
		 }
		
		 class B extends Circle {
	     private double length;
		
		 B(double radius, double length) {
		 Circle(radius);
		 length = this.length;
		 }
		private void Circle(double radius) {
			// TODO Auto-generated method stub
			
		}
		@Override 
		
		public double getArea() {
		return getArea() * length;
		 }
	 }


