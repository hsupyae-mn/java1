
public class CP10_15 {
	public static void main(String[]args){
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		String s4 = "Welcome to Java";
		
		        
		        System.out.println(s1 == s2); 
				System.out.println(s1 == s3);
				System.out.println(s1 == s4);
				System.out.println(s1.equals(s3));
				System.out.println(s1.equals(s4));
				System.out.println("Welcome to Java".replace("Java", "HTML"));
				System.out.println(s1.replace('o', 'T'));
				System.out.println(s1.replaceAll("o", "T"));
				System.out.println(s1.replaceFirst("o", "T"));
				System.out.println(s1.toCharArray());
				
				String s5 = "Welcome to Java";
				String s6 = s5.replace("o", "abc");
				System.out.println(s5);
				System.out.println(s6);
				
				
				System.out.println("Hi, ABC, good".matches("ABC "));
				System.out.println("Hi, ABC, good".matches(".*ABC.*"));
				System.out.println("A,B;C".replaceAll(",;", "#"));
				System.out.println("A,B;C".replaceAll("[,;]", "#"));
				String[] tokens = "A,B;C".split("[,;]");
				for (int i = 0; i < tokens.length; i++)
				System.out.print(tokens[i] + " ");
	}

}
