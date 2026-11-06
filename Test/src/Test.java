import java .util.Scanner;
public class Test {
 public static void main(String[] args){
	 Scanner input =new Scanner(System.in);
	 System.out.println("Enter tje am of water ");
	 double amwater =input.nextDouble ();
	 System.out.println("Enter the initial tem");
	 double initem=input.nextDouble();
	 System.out.println("Enter the final tem");
	 double fitem=input.nextDouble();
	 double Q= amwater *(fitem-initem);
	 System.out.println("The energy neded is"+Q );
	 
 }
}
