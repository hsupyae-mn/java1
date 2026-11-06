import java.util.Scanner;
public class Linearsearch {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of item");
		int n=input.nextInt();
		int[]numbers=new int[n];
		System.out.print("Enter the number");
		for(int i=0;i<n;i++){
		numbers[i]=input.nextInt();
		}
		System.out.print("Enter the number of key");
		int key=input.nextInt();
		linearSearch(numbers,key);
		
		
		
	}
	
	public static void linearSearch(int[]list, int key){
		for (int i=0; i<list.length;i++){
			if (key==list[i]){
				System.out.print("Search number at "+ i);break;
				
			}
			else
				System.out.print("NOt Found!");
		}
	}

}
