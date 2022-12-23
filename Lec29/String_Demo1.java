package Lec29;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sneha";
		String str1 = "Sneha";
		String str3 = "rai";
		String str31 = new String("rai");
		String str2 = new String("Raiji");
		String str4 = new String("Raiji");
//		System.out.println(str.length());
//		System.out.println(str2.length());
//		
		if(str==str1) // address 
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
		if(str2==str4)
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
		if(str3==str31)
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if(str3.equals(str31))
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
		
		if(str.equals(str1)) // content 
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
		if(str2.equals(str4))
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
	}

}
