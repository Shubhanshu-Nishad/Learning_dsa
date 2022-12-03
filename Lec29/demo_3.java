package Lec29;

public class demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "raiji";
		String str1 = "rai" + "ji"; //"raiji"
		
		String str2 = "rai";
		
		str2 = str2 +"ji";
		
		if(str==str2)
			System.out.println("equal");
		else 
			System.out.println("Not equal ");
		
		// substring 
		System.out.println(str2.substring(1,5));
		
	}

}
