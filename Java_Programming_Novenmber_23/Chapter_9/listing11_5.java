
public class listing11_5 {
		
		 public static void main(String[] args) { 
		 // Display circle and rectangle properties
		 displayObject(new GeometricObject
		 ("red", false));
		 displayObject(new GeometricObject
		 ("black", true));
		  } 
		
		 /** Display geometric object properties */
		 public static void displayObject(GeometricObject object) { 
		 System.out.println("Created on " + object.getDateCreated() + 
		 ". Color is " + object.getColor()); 
		 } 
		}


