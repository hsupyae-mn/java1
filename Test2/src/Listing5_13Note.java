import java.util.Scanner;
public class Listing5_13Note {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("enter a number");
		int n=input.nextInt();
		int factor = 2;
		while (factor <= n) {
		if (n % factor == 0)
		break;
		 factor++;
		}
		System.out.println("The smallest factor other than 1 for "
		 + n + " is " + factor);
		
		

	boolean found = false;
	int factor1 = 2;
	while (factor1 <= n && !found) {
	if (n % factor1 == 0)
	
	found = true;
	else
	 factor1++;
	}
	System.out.println("The smallest factor other than 1 for "
	 + n + " is " + factor1);
}
	}


