package Lec29;

public class demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		// == --> address
		if(str==str2)
			System.out.println("equal");
		else 
			System.out.println("Not equal ");
		
		if(str3==str4)
			System.out.println("equal");
		else 
			System.out.println("Not equal ");
		
		if(str==str3)
			System.out.println("equal");
		else 
			System.out.println("Not equal ");
		
		// equals -- > string value
		if(str.equals(str2))
			System.out.println("equal");
		else 
			System.out.println("Not equal ");
		
		if(str3.equals(str4))
			System.out.println("equal");
		else 
			System.out.println("Not equal ");
	}

}
