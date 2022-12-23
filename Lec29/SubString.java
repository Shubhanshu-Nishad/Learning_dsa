package Lec29;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SubString 
		String str = "Sneha";
//		
//		System.out.println(str.substring(0,1));
//		System.out.println(str.substring(1,1));
//		System.out.println(str.substring(2));
		
//		System.out.println(str.substring(0,4));
//		System.out.println(str.substring(1,4));
//		System.out.println(str.substring(2,4));
//		System.out.println("New Line");
//		System.out.println(str.substring(0,5));
//		System.out.println(str.substring(1,5));
//		System.out.println(str.substring(2,5));
		
		SubString(str);
	}

	public static void SubString(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length()+1; j++) {
				System.out.println(str.substring(i,j));
			}
			
		}
	}

}
