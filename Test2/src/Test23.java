import java.util.Scanner;
public class Test23 {
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		int i,h=1;
		System.out.println("Enter the number");
		int num=input.nextInt();
		for ( i=1;i<=num;i++){
			h=h*i;
			
		}
		System.out.println("The factorial of "+num+"is"+h);
	}

}
