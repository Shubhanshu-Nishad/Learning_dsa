package Lec29;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mala"; // str - str1
		String str1 = "Mala";
		System.out.println(str.compareTo(str1));
		
		System.out.println(str.charAt(3));
		
		// find smallest string in dict order 
		
		if(str.compareTo(str1) == 0 ) {
			System.out.println("str & str1 is equal");
			
		}else if(str.compareTo(str1) < 0){
			System.out.println("str is smaller");
		}
		else {
			System.out.println("str1 is smaller");
		}

	}

}
