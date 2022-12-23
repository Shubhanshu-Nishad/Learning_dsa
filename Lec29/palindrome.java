package Lec29;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		String rev = "";
		for (int i = str.length()-1; i >=0; i--) {
			
		// 	rev =+ str.charAt(i); // incorrect
			
			rev = rev + str.charAt(i); // correct // 
			
		}
		System.out.println(rev);
		System.out.println(pallindrome(rev));

	}

	public static boolean pallindrome(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
	}

}
